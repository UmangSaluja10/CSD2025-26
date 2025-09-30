package OOPS.EXCEPTION_HANDLING;

import java.util.Scanner;

class MyException extends Exception {
    public MyException() {
        super("Not allowed");
    }

    public MyException(String message) {
        super(message);
    }

    public class test {
        public static void main(String[] args) throws MyException {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a < 18) {
//                throw new MyException();
                throw new MyException("Hey this is not allowed");
            } else {
                System.out.println("Leave it!!");
            }
        }
    }
}