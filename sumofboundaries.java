import java.util.*;
public class sumofboundaries
{
    int sob(int x[][],int r,int c)
    {
        int s=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 && j<c)
                {
                    s=s+x[i][j];
                }
                if(i==r-1 && j<c)
                {
                    s=s+x[i][j];
                }
                if((i!=0 || i!=r-1) && (j==0 || j==c-1))
                {
                    s=s+x[i][j];
                }
            }
        }
        return s;
    }

    void display(int s)
    {
        System.out.println(s);
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        sumofboundaries ob=new sumofboundaries();
        int sum=0;
        System.out.println("Enter the no of rows and columns");
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter th array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        sum=(ob.sob(a,n,m));
        ob.display(sum);
    }
}