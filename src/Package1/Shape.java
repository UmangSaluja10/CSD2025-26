
//6.WAP to create a class “SimpleObject” and display messages by using the constructor of this class.
/*
package Package1;
public class SimpleObject {
    SimpleObject() {
        System.out.println("This is constructor of SimpleObject class");
    }
    public static void main(String[] args) {
        SimpleObject ob =  new SimpleObject();
    }
}
*/

//7.WAP to create class Number with only one private instance variable as a double primitive type, include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() in this class and all above methods should return boolean primitive type like for isPositive() should return “Positive = True”.
/*
package Package1;
import java.util.*;
public class Number{
    private double num;
    Number(double num){
        this.num=num;
    }
    public boolean isZero(){
        return(num==0);
    }
    public boolean isPositive(){
        return(num>0);
    }
    public boolean isNegative(){
        return(num<0);
    }
    public boolean isOdd(){
        return(num%2==1);
    }
    public boolean isEven(){
        return(num%2==0);
    }
    public boolean isPrime(){
        if(isZero() || num==1)return false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        int temp=0;
        int n=(int)num;
        while(n!=0){
            int d = n%10;
            temp=temp+(int)Math.pow(d,3);
            n=n/10;
        }
        return((double)temp==num);
    }

    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number: ");
     double n=in.nextDouble();
     Number ob = new Number(n);
        System.out.println("The check of the given number for isZero: "+ob.isZero());
        System.out.println("The check of the given number for isPositive: "+ob.isPositive());
        System.out.println("The check of the given number for isNegative: "+ob.isNegative());
        System.out.println("The check of the given number for isOdd: "+ob.isOdd());
        System.out.println("The check of the given number for isEven: "+ob.isEven());
        System.out.println("The check of the given number for isPrime: "+ob.isPrime());
        System.out.println("The check of the given number for isArmstrong: "+ob.isArmstrong());
    }
}
 */

//8.WAP to create a Room class, the attributes of this class are roomno, roomtype, roomarea and ACmachine. In this class the member functions are setData and displayData. Use member function to set data and display that data using displayData() method.
/*
package Package1;
import java.util.*;
public class Room{
    public int roomno;
    public String roomtype;
    public double roomarea;
    public String ACmachine;
    public void setData(int roomno, String roomtype, double roomarea, String ACmachine){
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }
    public void getData(){
        System.out.println("Room no: " + roomno);
        System.out.println("Room type: " + roomtype);
        System.out.println("Room area: " + roomarea);
        System.out.println("AC machine: " + ACmachine);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Enter room no: ");
        int roomno = in.nextInt();
        System.out.println("Enter room type: ");
        String roomtype = in.next();
        System.out.println("Enter room area: ");
        double roomarea = in.nextDouble();
        System.out.println("Enter AC machine: ");
        String ACmachine = in.next();
        room.setData(roomno, roomtype, roomarea, ACmachine);
        room.getData();
    }
}
 */

//9.WAP to create a class named Shape and create three subclasses Circle, Triangle and Square, each class has two-member functions named draw () and erase (). Implement this concept using polymorphism.

package Package1;
public class Shape {
    static class Circle extends Shape{
        public void draw(){
            System.out.println("Drawing Circle");
        }
        public void erase(){
            System.out.println("Erasing Circle");
        }
    }
    static class Triangle extends Shape{
        public void draw(){
            System.out.println("Drawing Triangle");
        }
        public void erase(){
            System.out.println("Erasing Triangle");
        }
    }
    static class Square extends Shape{
        public void draw(){
            System.out.println("Drawing Square");
        }
        public void erase(){
            System.out.println("Erasing Square");
        }
    }
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        ((Circle) s).draw();
        ((Circle) s).erase();

        s = new Triangle();
        ((Triangle) s).draw();
        ((Triangle) s).erase();

        s = new Square();
        ((Square) s).draw();
        ((Square) s).erase();

    }
}
