package OOPS.ENCAPSULATION;

import java.lang.reflect.Field;

class Employee{
    private double salary;
    private String name;

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
            System.out.println("Salary set: "+salary);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
public class Encapsu {
    public static void main(String[] args)throws Exception {
        System.out.println("Hello");
        Employee emp = new Employee();
        //How to access private members? Answer: Reflection. and process is below:
//        Field fsalary = Employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        emp.setSalary(5000);

        emp.setSalary(10000);
        System.out.println(emp.getSalary());
    }
}
