import java.util.*;
public class capital
{
        private int freq;
    private String sent;
public capital()
{
    this.freq=0;
}
void input ()
{
Scanner in=new Scanner(System.in);
this.sent=in.nextLine();
}
private boolean isCap(String w)
{
return(w.charAt(0)>=65 && w.charAt(0)<=90);
}
public void display()
{
String words[]=this.sent.split("");
System.out.println(this.sent);
for(String word:words)
{
if(isCap(word))
this.freq+=1;
}
System.out.println("Frequency of the capital words:"+this.freq);
}
public static void main(String args[])
{
capital ob=new capital();
System.out.println("****Capital Letter**** ");
ob.input();
ob.display();
}
}