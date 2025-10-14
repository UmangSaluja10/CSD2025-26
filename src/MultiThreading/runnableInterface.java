package MultiThreading;

public class runnableInterface implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
    }
    public static void main(String[] args){
        runnableInterface cs = new runnableInterface();
        Thread t1 = new Thread(cs);
        t1.start();
    }
}
