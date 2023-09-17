package multiThreading;

class TestD extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
        }
        else{
            System.out.println("Child thread");
        }
        
    }
}
public class mt4 {
    public static void main(String[] args){
        //Thread.currentThread().setDaemon(true); //not possible
        System.out.println("Main thread");
        TestD td = new TestD();
        td.setDaemon(true);
        td.start();
    }
}
