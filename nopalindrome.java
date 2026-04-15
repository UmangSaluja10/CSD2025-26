
//Nonpalindrome help==leh==helpleh
import java.util.*;
public class nopalindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a word");
String st=in.nextLine();
int n=st.length();
String w="",wo="",str="";
System.out.println("palindromed Word:");
if (st.charAt(n-1)==st.charAt(n-2))
{
for(int k=0;k<(n-3);k++)
{
char ch=st.charAt(k);
st=st+ch;
}

}
for (int i=0;i<(n-1);i++)
{
char c=st.charAt(i);
w=w+c;
}
for(int j=0;j<n;j++)
{
char c=st.charAt(j);
wo=c+wo;
}
str=w+wo;
System.out.println(str);
}
}
