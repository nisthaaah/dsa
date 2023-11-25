package recursion.myPow;
import java.util.Scanner;

class powerHeightlogn {
    public static int calcPower(int base, int exponent){ //(2, 10)
        if(base == 0) return 0;
        if(exponent == 0) return 1;

        int half = calcPower(base, exponent / 2); //exponents => (10 -> 5 -> 2 -> 1 -> 0)
        //System.out.println(half);
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