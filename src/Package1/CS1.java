package Package1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CS1 {
    public static void main(String[] args) {
        System.out.println("CS1 class");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
class Aa{
    public static  void main(String[] args) {
        System.out.println("Aa class");
        CS1.main(new String[]{"Hello","Aj","Atharva"});
    }
}
