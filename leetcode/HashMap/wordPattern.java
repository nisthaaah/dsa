package leetcode.HashMap;
import java.util.*;

public class wordPattern {
    public boolean pattern(String pattern, String s){
        String[] words = s.split(" "); //words = ["dog", "cat", "cat", "dog"]
        if(words.length != s.length()) return false;

        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){ //abba
            char currChar = pattern.charAt(i); //=> (0)a, (1)b, (2)b
            if(map.containsKey(currChar)){ //b
                if(!map.get(currChar).equals(words[i])) return false;     
            }
            else{
                if(map.containsValue(words[i])){
                    return false;
                }
                else map.put(currChar, words[i]); // (a, dog) , (b, cat)
            }
        }
        return true;
    }

    public static void main(String[] args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println("The pattern and the string follows the same pattern: " +new wordPattern().pattern(pattern, s));
    }  
}