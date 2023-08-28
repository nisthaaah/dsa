package oops.Encapsulation;

public class Encapsulation {
    public static void main(String[] args){
        Account a = new Account();
        a.name = "nistha";
        a.email = "nistha@gmail.com";
        a.setPw("abcd"); 
        System.out.println(a.getPw());
    }
}
