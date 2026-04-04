//2025==20+25=45^2=2025
import java.util.*;
public class technumber
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to be check for Tech Number:");
        int num=in.nextInt();
        int n=num;
        double sum=0,s=0;
        while(num>0)
        {
            int d=num%100;
            sum=sum+d;
            num=num/100;
        }
        s=s+Math.pow(sum,2);
        if(s==n)
        {
            System.out.println("The given number is a Tech Number");
        }
        else
        {
            System.out.println("The given number is not a Tech Number");
        }
    }
}