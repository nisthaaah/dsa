package multiThreading;

class joinTest extends Thread{

    public void run()
    {
        try {
        for(int i = 1; i <=3; i++)
        {
            System.out.println("Child Thread " +i);
            Thread.sleep(1000);
            } 
        }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

public class mt7 {
    public static void main(String[] args) throws InterruptedException{
        joinTest j = new joinTest();
        j.start();
        j.join();

        for(int i = 1; i <=3; i++){
            System.out.println("Main thread " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}