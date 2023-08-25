package leetcode.Random;
import java.util.*;

public class happyNumber {
    public boolean isHappy(int n){
        Set<Integer> usedIntegers = new HashSet<>(); //< 82, 68, 100 >
        while(true){
            int sum = 0;

            while(n!=0){                 //(9,2) -> 81 || (1,2) -> 1 => 82, (2,2) -> 4 || (8,2) -> 64 => 68, (8,2) -> 64 || (6,2) -> 36 => 100
            sum+= Math.pow(n % 10, 2); //(0,2) -> 0  || (0,2) -> 0 || (1,2) -> 1
            n/=10; //1 || 8 || 6 || 10 || 1
        }
        if(sum == 1) return true; //true
        else n = sum;
        
        if(usedIntegers.contains(n)) return false;
        else usedIntegers.add(n);
    }
}

public static void main(String[] args){
    int n = 19;
    System.out.println("Is the number " + n + " Happy?\n" +new happyNumber().isHappy(n));
  }   
}
