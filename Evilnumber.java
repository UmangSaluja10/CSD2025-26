import java.util.*;
public class Evilnumber
{
    static String d2b(int n)
    {
        String bin="";
        while(n!=0)
        {
            int d =n%2;
            bin=d+bin;
            n=n/2;
        }
        return bin;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to be check for Evil Number:");
        int num=in.nextInt();
        int sum=0;
        String a=d2b(num);
        System.out.println(a);
        int b=Integer.parseInt(a);
        while(b>0)
        {
            int d=b%10;
            sum=sum+d;
            b=b/10;
        }
        if(sum%2==0)
        {
            System.out.println("The given number is not an Evil Number");
        }
        else
        {
            System.out.println("The given number is an Evil Number");
        }
    }
}