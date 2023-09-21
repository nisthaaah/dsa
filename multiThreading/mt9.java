package multiThreading;

class newTest extends Thread{
    public void run(){
        System.out.println("A: " +Thread.interrupted()); //true -> false
        //System.out.println(Thread.currentThread().isInterrupted()); //false -> false
        //System.out.println(Thread.interrupted());
        try{
        for(int i = 1; i <= 3; i++){
            System.out.println(i);
            Thread.sleep(1000);
            System.out.println("B: " +Thread.currentThread().isInterrupted());

        }
    } catch(Exception e){
        System.out.println("Thread interrupted");
    }
    }
}
public class mt9 {
    public static void main(String[] args){
        newTest nt = new newTest();
        nt.start();
        nt.interrupt();
    }
}
