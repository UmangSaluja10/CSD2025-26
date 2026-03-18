import java.util.*;
public class validdate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String M[]={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter date to be pirnt in text:-");
        String date=in.nextLine();
        int d=Integer.parseInt(date.substring(0,2));
        int m=Integer.parseInt(date.substring(2,4));
        int y=Integer.parseInt(date.substring(4));
        if(m>0 && m<=12)
        {
            switch(m)
            {
                case 1,3,5,7,8,10,12:
                    {
                        if(d>0 && d<=31)
                            System.out.println(d+M[m-1]+y);
                        else
                            System.out.println("Invalid Date");
                        break;
                    }
                case 4,6,9,11:
                    {
                        if(d>0 && d<=30)

                            System.out.println(d+M[m-1]+y);
                        else
                            System.out.println("Invalid Date");
                        break;
                    }
                case 2:
                    {
                        if(y%4==0)
                        {
                            if(d<=29)
                                System.out.println(d+M[m-1]+y);
                            else

                                System.out.println("Invalid Date");
                            break;
                        }
                        else
                        {
                            if(d<=28)
                                System.out.println(d+M[m-1]+y);
                            else
                                System.out.println("Invalid Date");
                        }
                    }
            }
        }
    }
}