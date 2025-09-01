

/*10.WAP to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer.
In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.*/

/*package Package1;
import java.util.*;
public class Employee {
    double salary;
    Employee(double salary){
        this.salary=salary;
    }
    double calculateSalary(){
        return salary;
    }
    static class Manager extends Employee{
        Manager(double salary){
            super(salary);
        }
        @Override
        double calculateSalary() {
            return salary*1.5;
        }
    }
    static class Programmer extends Employee{
        Programmer(double salary){
            super(salary);
        }
        @Override
        double calculateSalary() {
            return salary*2.5;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = in.nextDouble();
        Employee e = new Employee(salary);
        Employee.Manager m = new Employee.Manager(salary);
        Employee.Programmer p = new Employee.Programmer(salary);
        System.out.print("Enter Name: ");
        String name = in.next();
        switch(name){
            case "Employee":
                System.out.println("Normal Employee salary: "+e.calculateSalary());
                break;
            case "Manager":
                System.out.print("Manager salary: "+m.calculateSalary());
                break;
            case "Programmer":
                System.out.print("Programmer salary: "+p.calculateSalary());
                break;
            default:
                System.out.println("Invalid input \n Enter Employee or Manager or Programmer!!");
        }
    }
}
 */

/*11.WAP to implement the concept of method overloading and method overriding.
And Abstract Class.*/
/*
package Package1;

// Abstract class
abstract class AbstractCalculator {
    abstract int multiply(int a, int b);

    void showMessage() {
        System.out.println("This is from AbstractCalculator base class.");
    }
}

public class overLoadingAndRiding extends AbstractCalculator {
    // method overloading
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public int add(int a, int b, String str) {
        System.out.println("The sum of two with String: " + str);
        return a + b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        overLoadingAndRiding ob = new overLoadingAndRiding();
        System.out.println("Sum of two(using method overloading): " + ob.add(1, 2));
        System.out.println("Sum of three(using method overloading): " + ob.add(1, 2, 3));
        System.out.println("Sum of four(using method overloading): " + ob.add(1, 2, 3, 4));
        System.out.println("(using method overriding)"+ob.add(1, 2, "Hello!!"));

        class1 ob1 = new class1();
        System.out.println("Sum of two (Overridden in class1): " + ob1.add(1, 2));

        ob.showMessage();
        System.out.println("Multiplication (abstract method implemented): " + ob.multiply(3, 4));
    }
}

// Overriding
class class1 extends overLoadingAndRiding {
    @Override
    public int add(int a, int b) {
        return a - b + a + b - a + b;
    }
}
 */

/*12.WAP to Create a class Employee having members as follows:
private int empNo
private String empName
private int empBasic
Parameterized constructor to initialize members.
Getter methods for all instance variables
*/
/*
package Package1;

public class Employee {
        private int empNo;
        private String empName;
        private int empBasic;

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }

    Employee(int empNo, String empName, int empBasic) {
            this.empNo = empNo;
            this.empName = empName;
            this.empBasic = empBasic;
        }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Amit", 1);
        Employee e2 = new Employee(102, "Bobby", 2);
        System.out.println(e1.getEmpBasic());
        System.out.println(e2.getEmpBasic());
        System.out.println(e1.getEmpName());
        System.out.println(e2.getEmpName());
        System.out.println(e1.getEmpNo());
        System.out.println(e2.getEmpNo());
    }
}
 */

/*
13.Create a class WriteEmployee having a main method.
Ask users to enter details of an employee and set them in an Employee object.
Store details of this object in a file emp.txt. Read employee
details from the file and display those details.
*/
package Package1;
import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + "\nName: " + name + "\nSalary: " + salary;
    }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        try {
            FileWriter fw = new FileWriter("emp.txt");
            fw.write(emp.toString());
            fw.close();
            System.out.println("Employee details written to emp.txt");

            // 4. Read from file
            System.out.println("\nReading from file:");
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
