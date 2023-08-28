package oops.Abstraction;

interface Human{
    int eyes = 2;
    void walk(); //by default public & abstract 
}

class Male implements Human{
    public void walk(){
        System.out.println("He is walking");
    }
}

public class Interface {
    public static void main(String[] args){
        //Human h = new Human(); 
        Male m = new Male();
        m.walk();
    }   
}