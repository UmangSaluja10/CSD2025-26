package Package1;

public class employee_super {
    String name;
    double salary;
    employee_super(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void show(){
        System.out.println("Name: " + name+", Salary: " + salary);
    }
    static class Manager extends employee_super {
        String dept;
        Manager(String name, double salary, String dept) {
            super(name, salary);
            this.dept = dept;
        }
        void show(){
            super.show();
            System.out.println("Dept: " + dept);
        }
    }
    public static void main(String[] args){
        Manager m = new Manager("Sachin",90000,"IT");
        m.show();
    }
}
