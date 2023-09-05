package leetcode.HashMap;
import java.util.*;

public class wordPattern {
    public boolean pattern(String pattern, String s){
        String[] words = s.split(" "); //words = ["dog", "cat", "cat", "dog"]
        if(words.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){ //a b b c
            char currChar = pattern.charAt(i); //=> (0)a, (1)b, (2)b, (3)c
            if(map.containsKey(currChar)){ //b, c
                if(!map.get(currChar).equals(words[i])) return false;     
            }
            else{
                if(map.containsValue(words[i])){
                    return false; //false
                }
                else map.put(currChar, words[i]); // (a, dog) , (b, cat)
            }
        }
        return true;
    }

    public static void main(String[] args){
        String pattern = "abbc";
        String s = "dog cat cat dog";
        System.out.println("The pattern and the string follows the same pattern: " +new wordPattern().pattern(pattern, s));
    }  
}