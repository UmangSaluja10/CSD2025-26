package Package1;

import java.util.Scanner;

public class CS2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Data:");
        String data=in.nextLine();
        System.out.println("Enter Number:");
        int number=in.nextInt();
        System.out.printf("Data: %s\nNumber: %d",data,number);
    }
}
