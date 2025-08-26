package OOPS.POLYMORPHISM;
//dynamic poymorphism or late binding
class A1{
    void m1(){
        System.out.println("Coming from m1 method");
    }
}
class B1 extends A1{
    @Override
    void m1(){
        System.out.println("Coming from m2 method");
    }
}
public class Dpoly {

    public static void main(String[] args){
        System.out.println("A");
        A1 x = new B1();
        x.m1();
    }
}
