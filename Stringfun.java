import java.util.*;
public class Stringfun
{
String str=" ";
void input()
{
    Scanner in=new Scanner(System.in);
System.out.println("Enter the string:-");
str=in.nextLine();
}
void words()
{
    int w=0,v=0,u=0;
    str=str+" ";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch==' ')
{
w++;
}
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
v++;
}
if((int)ch>=65 && (int)ch<=90)
{
u++;
}
}
System.out.println("Number of Words"+w);
System.out.println("Frequency of Vowels"+v);
System.out.println("Frequency of Uppercase letters"+u);
}
public static void main(String args[])
{
Stringfun ob=new Stringfun();
ob.input();
ob.words();
}
}