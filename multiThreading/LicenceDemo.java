package multiThreading;


class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical Starts");
            Thread.sleep(1000);
            System.out.println("Medical Completed\n");

        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("Test Drive Starts");
            Thread.sleep(3000);
            System.out.println("Test Drive Completed\n");

        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Oficcer extends Thread{
    public void run(){
        try{
            System.out.println("Officer takes the file");
            Thread.sleep(2000);
            System.out.println("Officer's work Completed");

        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException{
        Medical m = new Medical();
        m.start();
        m.join();

        TestDrive t = new TestDrive();
        t.start();
        t.join();

        Oficcer o = new Oficcer();
        o.start();
    }
}