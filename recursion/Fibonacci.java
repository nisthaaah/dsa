package recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void fibn(int a, int b, int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.println(c);
        fibn(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int a= 0, b=1;
        int n= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println("Fibonacci series: ");
        fibn(a, b, n-2);
    }

}
