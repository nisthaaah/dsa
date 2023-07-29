package recursion;

import java.util.Scanner;

class Power{
    static int power(int base, int exponent){
        if(exponent==0) return 1;
        else{
            return base * power(base, exponent-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of base and exponent: ");
        int base=sc.nextInt(); 
        int exponent=sc.nextInt();  
        System.out.println("The result is: " + power(base, exponent));
    }
}