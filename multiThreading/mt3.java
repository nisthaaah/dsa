package multiThreading;

class myThread extends Thread{
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        System.out.println("Task is executed by " +Thread.currentThread().getName());
    } 
}

public class mt3 {
    public static void main(String[] args){
        System.out.println("Main is printed by " +Thread.currentThread().getName());
        myThread th1 = new myThread();
        th1.start();
        System.out.println(Thread.currentThread().isAlive());

        myThread th2 = new myThread();
        th2.setName("ABC");
        th2.start();
        System.out.println(th1.isAlive());

        // System.out.println(Thread.currentThread().getName());
        // //Thread.currentThread().setName("Nistha");
        // //System.out.println(Thread.currentThread().getName());
        // System.out.println(10/0);

    }
    
}
