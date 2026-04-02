 import java.util.*;
public class Calendar
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int c[][]=new int[5][7];
System.out.println("Enter the first day of the month in numerical value");
int n=in.nextInt();
int a=1;
String s[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
System.out.println("Monday"+"\t"+"Tuesday"+"\t"+"Wednesday"+"\t"+"Thursday"+"\t"+"Friday"+"\t"+"Saturday"+"\t"+"Sunday");
for(int i=0;i<5;i++)
{
for(int j=0;j<7;j++)
{
if(i==0 &&j<=n)
{
System.out.print(" ");
}
else if(j<(31+n))
{
System.out.print(" ");
}
else if(i==0 && j<=n)
{
    c[i][j]=a;
System.out.print(c[i][j]);
a++;
}
}
System.out.println();
}
}
}