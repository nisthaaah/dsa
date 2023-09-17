package multiThreading;

class TestD extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
            System.out.println("Daemon Thread priority: " +Thread.currentThread().getPriority());
        }
        else{
            Thread.currentThread().setPriority(10);
            System.out.println("Child Thread priority: " +Thread.currentThread().getPriority());
        }
        
    }
}
public class mt4 {
    public static void main(String[] args){
        //Thread.currentThread().setDaemon(true); //not possible
        System.out.println("Main thread");
        System.out.println("Main Thread priority: " +Thread.currentThread().getPriority());
        TestD td = new TestD();
        //td.setDaemon(true);
        td.start();
    }
}
