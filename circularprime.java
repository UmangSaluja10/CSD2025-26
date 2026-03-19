//Circular prime no 131==311==113==131 all are prime
import java.util.*;
public class circularprime
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a 3 digit prime number");
int n=in.nextInt();
int e=0,c=0,num;
num=n;
for (int i=2;i<n;i++)
{
if(n%i==0)
c++;
}
{
if(c!=0)
System.out.println("Invalid input");
}
while(n==num)

{
int d=n/100;
n=n%100;
n=(n*10)+d;
for (int i=2;i<n;i++)
{
if(n%i==0)
e++;
if (e==0)
continue;
else{
System.out.println("NOT A CIRCULAR NUMBER");
System.exit(0);
}
}
System.out.println("CIRCULAR PRIME NUMBER");
}
}
}