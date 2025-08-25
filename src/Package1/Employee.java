package Package1;
import java.util.*;
public class Employee {
    String name;
    long salary;
    String city;
    public void calcIncomeTax(){
        System.out.println("Income Tax "+0.18*salary);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Employee[] e1 = new Employee[3];
        for(int i=0;i<3;i++) {
            e1[i] = new Employee();
        }
        e1[0].name = "Rakesh";
        e1[0].salary = 100000;
        e1[0].city = "Mumbai";
        e1[1].name = "Ramesh";
        e1[1].salary = 150000;
        e1[1].city = "Meerut";
        e1[2].name = "Rohan";
        e1[2].salary = 125000;
        e1[2].city = "Delhi";
        for(int i=0;i<3;i++){
            if(e1[i].city.equals("Delhi")){
                System.out.println("The name of the person living in Delhi is "+e1[i].name);
                e1[i].calcIncomeTax();
            }
        }
    }
}
