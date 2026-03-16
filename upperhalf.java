import java.util.*;
public class upperhalf
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the array:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();  
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);  
            }
            System.out.println();
        }
        System.out.println("after selecting the upper half");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<i)
                {
                    System.out.print(" "); 
                }
                if(j>=i)
                {
                    System.out.print(a[i][j]);  
                }
            }
            System.out.println();
        } 
    }
}