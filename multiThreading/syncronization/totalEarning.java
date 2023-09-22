package multiThreading.syncronization;

class Earning extends Thread{
    int total = 0;
    public void run(){
    synchronized(this){
    for(int i = 0; i <= 10; i++){
        total += 100;     
    }
    this.notify();
        }
    }
}

public class totalEarning {
    public static void main(String[] args) throws Exception{
        Earning e = new Earning();
        e.start();
        synchronized(e){
            e.wait();
        }
        System.out.println("Total Earnings: " +e.total+ " Rs");
    }
}