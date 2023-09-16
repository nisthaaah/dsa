package multiThreading;

class Test1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}
class Test2  extends Thread{
    public void run(){
        System.out.println("Task 2");
    }
}
public class mt1 {
    public static void main(String[] args){ //main thread(JVM)
        Test1 t1 = new Test1(); //2nd thread
        t1.start();
        Test1 t2 = new Test1(); //3rd thread
        t2.start();

        Test2 t21 = new Test2(); //4th thread
        t21.start();
        //t.start();
    }
}
