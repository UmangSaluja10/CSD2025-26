// Three threads are created in this
// 1 made by program and 2 created by default
package MultiThreading;


public class ThreadClass extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
    }
    public static void main(String[] args){
        ThreadClass cs = new ThreadClass();
        cs.start();
    }
}

