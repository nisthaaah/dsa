package oops.Abstraction;

interface Engine{
    int price = 79000;
    void start(); //by default public & abstract 
    void stop();
    void acc();
}

interface Brake{
    void brake();
}

class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("BRAKE!!");
    }

    @Override
    public void start() {
        System.out.println("START!!");
    }

    @Override
    public void stop() {
        System.out.println("STOP!!");
    }

    @Override
    public void acc() {
        System.out.println("ACCELERATE!!");
    }
}

public class Interface {
    public static void main(String[] args){
        //Engine e = new Engine();
        //Engine c = new Car();
        Car c = new Car();
        c.start();
        c.acc();
        c.stop();
    }   
}