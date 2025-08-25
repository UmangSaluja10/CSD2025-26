package Package1;
import java.util.*;
public class CS3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b && a>c){
            System.out.println("a is maximum "+a);
        }
        if(b>a && b>c){
            System.out.println("b is maximum "+b);
        }
        if(c>a&&c>b){
            System.out.println("c is maximum "+c);
        }
    }
}
