import java.util.*;
public class keprekar
{
    public void check(int n)
    {
        double sq=Math.pow(n,2);
        String s=""+sq;
        String a="",b="";
        int len=s.length();
        System.out.println(sq);
        if(len%2==0)
        {
            a=s.substring(0,(len/2)-1);
            b=s.substring((len/2)-1,len-2);
        }
        else
        {
            a=s.substring(0,((len+1)/2)-2);
            b=s.substring((((len+1)/2)-2),len-2);
        }
        System.out.println("part1:"+a+"     "+"part2:"+b);
        int na=Integer.parseInt(a);
        int nb=Integer.parseInt(b);
        int sum=na+nb;
        System.out.println(sum);
        if(sum==n)
        {
            System.out.println("Entered number is keprekar");
        }
        else
        {
            System.out.println("Entered number is not keprekar");
        }
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("**********KEPREKAR**********");
        System.out.println("Enter a number to be check for Keprekar:");
        int a=in.nextInt();
        keprekar ob=new keprekar();
        ob.check(a);
    }
}