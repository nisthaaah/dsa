package multiThreading.syncronization;

//Using Synchronization block
class Bank {
   double balance = 2000;
   void withdraw(double amount){
        System.out.println("WELCOME TO ABC BANK " +Thread.currentThread().getName());

        synchronized(this){
            if(balance >= amount){
            System.out.println(amount +" is withdrawing...");
            balance = balance - amount; 
            System.out.println("Balance after withdrawal: " +balance +"\n"); 
        }
        else{
            System.out.println("Insufficient Balance!! ");
            System.out.println("Balance left: " +balance);
        }
        }

        System.out.println("WELCOME TO ABC BANK1 " +Thread.currentThread().getName());
        System.out.println("WELCOME TO ABC BANK1 " +Thread.currentThread().getName());
        System.out.println("WELCOME TO ABC BANK1 " +Thread.currentThread().getName());
    }
}

public class BankAccount extends Thread{ //thread
    static Bank ba;
    double amount;
    public void run(){
        ba.withdraw(amount);
    }   

    public static void main(String[] args){
        ba = new Bank();

        BankAccount withdrawal1 = new BankAccount();
        withdrawal1.amount = 300;
        withdrawal1.start();

        BankAccount withdrawal2 = new BankAccount();
        withdrawal2.amount = 2000;
        withdrawal2.start();
    }
}