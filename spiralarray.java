import java.util.*;
public class spiralarray
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
                System.out.println("****SPIRAL ARRAY*****");
        System.out.println("Enter the size of an array:-");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        int N=n;
        System.out.println("Enter the matrix");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The given array:-");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The Spiral array:-");
        for(int i=N-1,j=0;i>0;i--,j++)
        {
            for(int k=j;k<i;k++)
                System.out.print(a[j][k]+" ");
            for(int k=j;k<i;k++)
                System.out.print(a[k][i]+" ");
            for(int k=i;k>j;k--)
                System.out.print(a[i][k]+" ");
            for(int k=i;k>j;k--)
                System.out.print(a[k][j]+" ");
        }
        if(N%2==1)
            System.out.println(a[(N-1)/2][(N-1)/2]);
    }
}
