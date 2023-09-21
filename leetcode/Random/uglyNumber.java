package leetcode.Random;

public class uglyNumber {
    public static boolean isUgly(int n){
        if(n < 0) return false;
        if(n == 0) return true;
        if(n == 1) return true;

        while(n >= 0){
            if(n == 1) return true; 
            if(n % 2 == 0) n /= 2;
            else if(n % 3 == 0) n /= 3;
            else if(n % 5 == 0) n /= 5;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbersToCheck = {6, 8, 14, 25, 30, 55};

        for (int n : numbersToCheck) {
            boolean res = isUgly(n);
            System.out.println(n + " is an ugly number: " + res);
        }
    }
}
