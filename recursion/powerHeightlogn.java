package recursion;
import java.util.Scanner;

class powerHeightlogn {
    public static int calcPower(int base, int exponent){
        if(base == 0) return 0;
        if(exponent == 0) return 1;

        int half = calcPower(base, exponent / 2);
        if(exponent % 2 == 0){ //even power
            return half * half;
        }
        else{ //odd power
            return half * half * base;
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of base and exponent: ");
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        System.out.println("\nThe result is: " + calcPower(base, exponent));
    }
}