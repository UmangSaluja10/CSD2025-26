import java.util.*;
public class paise_ruppe
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
double a=0;int b=0;
System.out.println("Enter the amount of money in decimal form-");
a=in.nextDouble();
b=(int)(a*100);
System.out.println("amount in paise form="+b);
}
}