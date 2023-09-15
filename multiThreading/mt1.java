package multiThreading;

class Test extends Thread{
    public void run(){
        System.out.println("Thread created");
    }
}
public class mt1 {
    public static void main(String[] args){
        Test t = new Test();
        t.start();
        //t.start();
    }
}
