import java.util.*;
public class xyz
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=in.nextInt();
        int a[]=new int[s];
        System.out.println("Enter array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        int b[]=new int[s];
        b=arrayop.bsort(a);
        for(int i=0;i<s;i++)
        System.out.println(b[i]);
    }
}