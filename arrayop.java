import java.util.*;
public class arrayop
{
    public static void lsearch(int a[],int b)
    {
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Search successful");
        }
        else
        {
            System.out.println("Search unsuccessful");
        }
    }

    public static void bsearch(int a[],int b)
    {
        int flag=0;
        int lb=0,ub=a.length-1,mid=0;
        while(lb<=ub)
        {
            mid=lb+ub/2;
            if(a[mid]==b)
            {
                flag=1;
                break;
            }
            if(a[mid]<b)
                lb=mid+1;
            if(a[mid]>b)
                ub=mid-1;
        }
        if(flag==1)
            System.out.println("Search successful");
        else
            System.out.println("Search unsuccessful");
    }

    public static int[] ssort(int a[])
    {
        int loc=0,t=0,min=0;
        for(int i=0;i<(a.length-1);i++)
        {
            min=a[i];
            loc=i;
            for(int j=i+1;j<(a.length);j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    loc=j;
                }
            }
            t=a[i];
            a[i]=a[loc];
            a[loc]=t;
        }
        return a;
    }
    public static int[] bsort(int a[])
    {
    int t=0;
    for(int i=0;i<a.length;i++)
    {
    for(int j=0;j<a.length-1-i;j++)
    {
    if(a[j]>a[j+1])
    {
    t=a[j];
    a[j]=a[j+1];
    a[j+1]=t;
    }
    }
    }
    return a;
    }
}