package multiThreading;

class sleepTest extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++)
        {
            try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(i+ ": " +Thread.currentThread().getName());
        }
    }
}

public class mt5 {
    public static void main(String[] args){
        sleepTest st1 = new sleepTest();
        st1.start();

        sleepTest st2 = new sleepTest();
        st2.start();
    }
}