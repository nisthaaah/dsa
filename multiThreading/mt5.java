package multiThreading;

public class mt5 extends Thread{
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

    public static void main(String[] args) {
       mt5 m1 = new mt5();
       m1.start();

       mt5 m2 = new mt5();
       m2.start();
    }
}