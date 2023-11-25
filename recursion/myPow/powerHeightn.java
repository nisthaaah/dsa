package recursion.myPow;
import java.util.Scanner;

class powerHeightn{
    static int power(int base, int exponent){
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        else{
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of base and exponent: ");
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        System.out.println("\nThe result is: " + power(base, exponent));
    }
}