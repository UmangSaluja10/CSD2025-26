import java.util.*;
public class sortingboundary
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        sortingboundary ob=new sortingboundary();
        int id=0;
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int m=in.nextInt();
        int size=(n*m)-(n-2)*(m-2);
        int b[]=new int[size];
        int a[][]=new int[n][m];
        System.out.println("Enter the matrix");
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
             a[i][j]=in.nextInt();
                }
            }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||i==n-1||j==0||j==m-1)
                {
                 b[id]=a[i][j];
                 id++;
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
                }
                System.out.println();
            }
              System.out.println();
        int s[]=arrayop.ssort(b);
        id=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||i==n-1||j==0||j==m-1)
                {
                 a[i][j]=s[id];
                 id++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
                }
                System.out.println();
            }
    }
}