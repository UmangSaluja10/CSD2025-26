//Program: reverse a number with recursion:-
import java.util.*;
class Reverse
{
static int r=0;
static int rev(int n)
{
if (n==0)
return r;
else
{
int d=n%10;
r=r*10+d;
return rev(n/10);
}
}
public static void main(String args [])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");

int num=in.nextInt();
System.out.println("Reverse of the number"+rev(num));
}
}