package oops.Polymorphism;


public class overloading {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(String name, int age){ //method overloading(compile time)
        System.out.println(name + " " + age);
    }

    public static void main(String[] args){
        overloading o1 = new overloading();
        o1.name = "nistha";
        o1.age = 23;
        o1.printInfo(o1.name, o1.age);
    }
}