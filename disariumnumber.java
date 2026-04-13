//135==1^1+3^2+5^3=135
import java.util.*;
public class disariumnumber
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to be check for Disarium Number:");
        int num=in.nextInt();
        int nn=num;
        double sum=0;
        String n=""+num;
        int m=n.length();
        while(num>0)
        {
            int d=num%10;
            sum=sum+(Math.pow(d,m));
            num=num/10;
            m--;
        }
        if(sum==nn)
        {
            System.out.println("The given number is a Disarium Number");
        }
        else
        {
            System.out.println("The given number is not a disarium Number");
        }
    }
}