package multiThreading;

class interruptTest extends Thread{
    public void run(){
    try{
        for(int i = 1; i <=3; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}
public class mt8 {
    public static void main(String[] args){
        interruptTest it = new interruptTest();
        it.start();
        it.interrupt();
    }  
}