import java.io.FileInputStream;

public class Eg1 {
    public static void main(String[] args){
    try{
        FileInputStream fis = new FileInputStream("c: abc.txt");
        Class.forName("com.mysq.jdbc.Driver");
    }
    catch(Exception e){
        System.out.println(e);
    } //Compile time exception
    
    int a= 100, b= 0, c;
    c = a/b;
    System.out.println(c); //Run time exception


    try{
    String s = null;
    System.out.println(s.length()); //Run time exception
    }
    catch(NullPointerException e){
        System.out.println(e);
    } //exception handling

    System.out.println("a");

    }
}