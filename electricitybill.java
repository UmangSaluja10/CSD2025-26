import java.util.*;
public class electricitybill
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:-");
        String name=in.nextLine();
        System.out.println("Enter your consumed units:-");
        int unit=in.nextInt();
        double bill=0.0;
        if(unit<=100)
        {
            bill=0.5*unit;
        }
        if(unit>100)
        {
            if(unit<=200)
                bill=50+(1*(unit-100));
            if(unit>200)
                bill=150+(2*(unit-200));
        }
        System.out.println("Name:-"+name+",  Units consumed:-"+unit+",  Amount to be paid:-"+bill);
    }
}