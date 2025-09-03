package Test;
import java.sql.SQLOutput;
import java.util.*;
abstract class Transport{
    String id;
    Transport(String id){
        this.id = id;
    }
    abstract void booking();
    abstract void cancel();
}
class cab extends Transport{
    cab(String id) {
        super(id);
    }
    void booking(){
        System.out.println("Cab is booked for ₹500 with CabId: "+id);
    }
    void cancel(){
        System.out.println("Cab Booking is cancelled with a refund of ₹300 ");
    }
}
class train extends Transport{
    train(String id) {
        super(id);
    }
    void booking(){
        System.out.println("Train is booked for ₹1200 with TrainId: "+id);
    }
    void cancel(){
        System.out.println("Train Booking is cancelled with a refund of ₹1000 ");
    }
}
class bus extends Transport{
    bus(String id) {
        super(id);
    }
    void booking(){
        System.out.println("Bus is booked for ₹200 with BusId: "+id);
    }
    void cancel(){}
}
public class QuickRide {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     Transport ob;
        System.out.println("Enter your Choice: \n1. Cab\n2. Train\n3. Bus");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                ob = new cab("CAB101");
                ob.booking();
                System.out.println("Enter 1 to cancel booking or any other number to confirm: ");
                if(in.nextInt()==1){
                ob.cancel();
                }
                else{
                    System.out.println("Booking confirmed!!");
                }
                break;
            case 2:
                ob = new train("TRN202");
                ob.booking();
                System.out.println("Enter 1 to cancel booking or any other number to confirm: ");
                if(in.nextInt()==1){
                    ob.cancel();
                }
                else{
                    System.out.println("Booking confirmed!!");
                }
                break;
            case 3:
                ob = new bus("BUS303");
                ob.booking();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
