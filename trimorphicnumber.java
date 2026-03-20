//25==25^25^25=15625%100=25
import java.util.*;
public class trimorphicnumber 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to be check for Trimorphic Number:");
        int n=in.nextInt();
        int nn=n;
        String s=""+n;
        int len=s.length();
        int t=n*n*n; 
        double d=t%(Math.pow(10,len));
        if(d==nn)
        {
            System.out.println("The given number is a Trimorphic Number");
        }
        else
        {
            System.out.println("The given number is not a Trimorphic Number");
        }
    }
}