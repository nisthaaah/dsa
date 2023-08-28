package oops.Abstraction;

abstract class Animal{
   abstract void walk(); //abstract method
   public void eat(){
        System.out.println("Animal eats");
   }
   Animal(){
        System.out.println("You are creating a new animal");
   }
}

class Cat extends Animal{
    public void walk(){
        System.out.println("Cat is walking");
    }
    Cat(){
        System.out.println("Cat is created");
    }
}

public class AbstractMethod {
    public static void main(String[] args){
        //Animal a = new Animal(); //abstract classes cannot be instantiated directly.
        Cat c = new Cat();
        //c.walk();
        //c.eat();
    }
}