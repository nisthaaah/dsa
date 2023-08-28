package oops.Polymorphism;

class Animal{
    public void walk(){
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal{ //method overriding(run time)
    public void walk(){
        System.out.println("Dog is walking");
    }
}

public class overriding {
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();
        a.walk();
        d.walk();

        Animal a1 = new Dog(); //upcasting
        a1.walk(); 
    }
}