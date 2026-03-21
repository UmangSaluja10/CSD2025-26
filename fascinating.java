//327==(327)+(327*2=654)+(327*3=981)=327654981=1-9numbers
import java.util.*;
public class fascinating
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to be check for fascinating Number:");
        int n=in.nextInt();
        int tn=n*2;
        int thn=n*3;
        String sn=""+n;
        String two=""+tn;
        String three=""+thn;
        String str="";
        str=str+sn+two+three;
        System.out.println(str);
        int len=str.length();
        int a[]=new int[len];
        int num=Integer.parseInt(str);
        int m=0;
        while(num>0)
        {
            int d=num%10;
            a[m]=d;
            num=num/10;
            m++;
        }
        int loc=0,t=0;
        for(int i=0;i<len-1;i++)
        {
            for (int j=0;j<len-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        int k=0;
        for(int i=0;i<len;i++)
        {
            System.out.println(a[i]);
            if(a[i]==(i+1))
            {
                k=1;
                continue;
            }
            else
            {
                k=0;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("The given number is a Facinating Number");
        }
        else
        {
            System.out.println("The given number is not a Facinating Number");
        }
    }
}