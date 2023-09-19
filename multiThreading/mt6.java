package multiThreading;

class yieldTest extends Thread{
    public void run(){
    for(int i = 1; i <= 5; i++){
        //Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName() +i+ ", Priority: " +Thread.currentThread().getPriority());
    }
}
}
public class mt6 {
    public static void main(String[] args){
        yieldTest yt = new yieldTest();
        yt.start();

        Thread.yield();
        for(int i = 1; i <=5; i++){
            System.out.println(Thread.currentThread().getName() +i+ ", Priority: " +Thread.currentThread().getPriority());
        }
    }
}