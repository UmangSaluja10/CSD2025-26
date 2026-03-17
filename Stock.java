import java.util.*;
public class Stock
{
    String item;
    double qty,rate,amt;
    public Stock(String i,double q,double r)
    {
        item=i;
        qty=q;
        rate=r;
        amt=qty*rate;
    }

    void display()
    {
        System.out.println("Item Name:"+item);
        System.out.println("Quantity:"+qty);
        System.out.println("Rate per unit:"+rate);
        System.out.println("Total Amount:"+amt);
    }
}