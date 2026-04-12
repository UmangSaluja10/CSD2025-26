import java.util.*;
public class specialmatri
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int s=in.nextInt();
        int a[][]=new int[s][s];
        System.out.println("Enter the matrix:");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int t=0,d=0,l=0,r=0;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(i==j||(i+j)==(s-1))
                {
                    continue;
                }
                else if(i!=0||i!=(s-1)&&j<i)
                {
                    l=l+a[i][j];
                }
                else if(i!=0||i!=(s-1)&&j>i)
                {
                    r=r+a[i][j];
                }
                else if(j!=0||j!=(s-1)&&i<j)
                {
                    t=t+a[i][j];
                }
                else if(j!=0||j!=(s-1)&&i>j)
                {
                    d=d+a[i][j];
                }
            }
        }  
        if(r==l&&t==d)
        {
            System.out.println("Special matrix");
        }
        if(r==l)
        {
            System.out.println("Left-Right matrix");
        }
        if(t==d)
        {
            System.out.println("Top-Down matrix");
        }
    }
}