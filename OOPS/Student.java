package OOPS;

public class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
        // Student(){
        //     this.name = "nistha";
        //     this.age = 23;
        // }  //non - parameterized constructor

        // Student(String name, int age){
        //     this.name = name;
        //     this.age = age;
        // } //parameterized constructor

        Student(Student s2){
            this.name = s2.name;
            this.age = s2.age;
        } //copy constructor

        Student(){
        }

    public static void main(String[] args){
        Student s1 = new Student(); 
        s1.name = "nistha";
        s1.age = 23;
        //s1.printInfo();

        Student s2 = new Student(s1);
        // s2.name = "harsh";
        // s2.age = 24;
        s2.printInfo();
    }
}
