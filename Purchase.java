import java.util.*;
class Purchase extends Stock
{
    int pqty;
    double prate;
    Purchase(String i,double q,double r,int a,double b)
    {
        super(i,q,r);
        pqty=a;
        prate=b;
    }

    void update()
    {
        qty+=pqty;
        if(prate!=rate)
        {
            rate=prate;
            amt=qty*rate;
        }
    }

    void display()
    {
        System.out.println("Stock:");
        super.display();
        update();
        System.out.println("purchase:");
        super.display();
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Purchase ob=new Purchase("smartwatch",10,1299,5,1100);
        ob.display();
}
}