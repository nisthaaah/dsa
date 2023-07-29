package recursion;

import java.util.Scanner;

public class Factorial {
    public static int factn(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factn(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();        
        System.out.println("The factorial of " +n +": ");
        System.out.println(factn(n));
    }
    
}