package leetcode.Random;
import java.util.*;

public class romanToInt {
    public int romanToInt(String s){
        Map<Character, Integer> myRoman = new HashMap<>();
        myRoman.put('I', 1);
        myRoman.put('V', 5);
        myRoman.put('X', 10);
        myRoman.put('L', 50);
        myRoman.put('C', 100);
        myRoman.put('D', 500);
        myRoman.put('M', 1000);

        int decimalVal = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && myRoman.get(s.charAt(i)) < myRoman.get(s.charAt(i + 1))){
                decimalVal -= myRoman.get(s.charAt(i));
            }
            else{
                decimalVal += myRoman.get(s.charAt(i));
            }
        }
        return decimalVal;
    }

    public static void main(String[] args){
        String s = "MCMXCIX";
        System.out.println("The Integer value of " +s+ " is: " +new romanToInt().romanToInt(s));
    }
}