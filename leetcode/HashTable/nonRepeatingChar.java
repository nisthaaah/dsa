package leetcode.HashTable;
import java.util.*;

public class nonRepeatingChar {
    public static Character nonRepeatingChar(String str){
        Map<Character, Integer> charCounts = new HashMap<>();

        for(char c: str.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) +1);

        }
        for(char c: str.toCharArray()){
            if(charCounts.get(c)==1){
                return c;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("leetcode"));
        System.out.println(nonRepeatingChar("hello"));
        System.out.println(nonRepeatingChar("aabbcc")); 
    }
    
}
