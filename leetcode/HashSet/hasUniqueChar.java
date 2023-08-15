package leetcode.HashSet;
import java.util.*;

public class hasUniqueChar {
    public static boolean hasUniqueChars(String string){
        Set<Character> charSet = new HashSet<>();
        for(char c: string.toCharArray()){
            if(charSet.contains(c)){
                return false;
            }
            else charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); 
        System.out.println(hasUniqueChars("hello"));
        System.out.println(hasUniqueChars(""));
    }
    
}