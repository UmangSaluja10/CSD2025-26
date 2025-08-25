package Package1;

import java.util.Scanner;

public class Student {
        // Members

        String name;
        long roll_no;
        String Branch = "Computer Science";
        char section = 'D';
        int[] marks = new int[10];
        // Methods

        public void checkResult() {
            System.out.println("Hello " + name);
        }

        public void avgMarks(int[] marks) {
            int avg = 0;
            for (int i = 0; i < marks.length; i++) {
                avg += marks[i];
            }
            System.out.println("Average marks for " + avg/10);
        }

        public static void main(String[] args) {
            Student ob1 = new Student();
            System.out.println("Enter student name ");
            Scanner sc = new Scanner(System.in);
            ob1.name = sc.nextLine();
            System.out.println("Enter student roll no");
            ob1.roll_no = sc.nextLong();
            System.out.println("Enter student marks");
            ob1.marks = new int[10];
            for (int i = 0; i < ob1.marks.length; i++) {
                ob1.marks[i] = sc.nextInt();
            }
            ob1.checkResult();
            ob1.avgMarks(ob1.marks);
        }
    }