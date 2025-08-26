package OOPS.POLYMORPHISM;
import java.util.*;
public class Cpoly {
    void m1(){
        System.out.println("B");
    }
    void m1(int c){
        System.out.println("C");
    }
    void m1(int c, String b){
        System.out.println("D");
    }
    void m1(String b, int c){
        System.out.println("E");
    }
    public static void main(String[] args){
        System.out.println("A");
        Cpoly cp = new Cpoly();
        cp.m1();
    }
    public static void main(){
        System.out.println("main overloaded");
        Cpoly cp = new Cpoly();
        cp.m1(9,"hiij");
    }
}
