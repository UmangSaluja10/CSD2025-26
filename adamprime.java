//12==12^2=144,21^2=441
import java.util.*;
public class adamprime 
{
    int reverse(int n)
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum=(sum*10)+d;
            n=n/10;
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        adamprime ob=new adamprime();
        System.out.println("enter a number to be check for Adamprime Number:");
        int num=in.nextInt();
        int rn=ob.reverse(num);
        int sn=num*num;
        int srn=rn*rn;
        int rsrn=ob.reverse(srn);
        if(rsrn==sn)
        {
            System.out.println("The given number is an Adamprime Number");
        }
        else
        {
            System.out.println("The given number is not an Adamprime Number");
        }
    }
}