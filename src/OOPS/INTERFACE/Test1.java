package OOPS.INTERFACE;
// if there is no field inside an interface i.e it has no variable and method then it is marker interface
//it is used to tag or mark the class
//for example there is a interface named serialisation in java
//jvm sees if any class is serialisable then only it will save it
// all methods inside interface is abstract and public
// the class which implements interface then the class should be public and abstract
// interface method cannot have any body
interface inter1{
int x =112;
void method1();
void method2();
}
interface inter2{
    int x=50;
    void method3();
}
public abstract class Test1 implements inter1,inter2{
    public static void main(String[] args) {
        System.out.println("Main entry point");
        System.out.println(inter1.x);
        int x=113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("This is method1");
    }
    public void method2(){
        System.out.println("This is method2");
    }
    public void method3(){
        System.out.println("This is method3");
    }
}
