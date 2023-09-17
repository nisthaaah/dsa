package multiThreading;

class myThread1 extends Thread{
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        System.out.println("Task 1 is executed by " +Thread.currentThread().getName());
    } 
}

class myThread2 extends Thread{
    public void run(){
        System.out.println("Task 2 is executed by " +Thread.currentThread().getName());
    }
}

public class mt3 {
    public static void main(String[] args){
        System.out.println("Main is printed by " +Thread.currentThread().getName());
        myThread1 th1 = new myThread1();
        th1.start();
        //System.out.println(th1.isAlive());

        myThread2 th2 = new myThread2();
        //th2.setName("ABC");
        th2.start();
        //System.out.println(th2.isAlive());

        // System.out.println(Thread.currentThread().getName());
        // //Thread.currentThread().setName("Nistha");
        // //System.out.println(Thread.currentThread().getName());
        // System.out.println(10/0);

    }  
}