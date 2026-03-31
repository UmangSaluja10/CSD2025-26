import java.util.*;
public class sum_of_DDA
{
    int m,n;
    int arr[][]=new int[m][n];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:-");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m>=2 && n>=2 && m<=10 && n<=10)
        {
           for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
            arr[i][j]=sc.nextInt();
            }
         }
        }
        else
        {
           System.out.println("Invalid Input");
           System.exit(0);
        }
    }

    int sum()
    {
      int s=0;
      for(int i=0;i<m;i++)
       {
            for(int j=0;j<n;j++)
            {
            s=s+arr[i][j];
            }
       }
       return s;
    }

    void display()
    {
      for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
            System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
       System.out.println("Sum"+sum());
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        sum_of_DDA ob=new sum_of_DDA();
        ob.input();
        ob.display();
}
}