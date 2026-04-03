import java.util.*;
public class digiclock
{
public static void main(String args[])
{
try{
for(int i=0;i<=13;i++)
{
for(int j=0;j<60;j++)
{
for(int k=0;k<60;k++)
{
System.out.println(i+":"+j+":"+k);
Thread.sleep(1);
System.out.println("\u000c");
if(i==12)
{
i=1;
}
}
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}