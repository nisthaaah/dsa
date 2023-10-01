package leetcode.String;
import java.util.*;

public class longestSubString {
    public int longestSubString(String s){
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            }
            else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }   
        }
        return max;
    }

        // for(int right = 0; right < s.length(); right++){
        //     while(!set.add(s.charAt(right))){ //checks duplicates characters
        //         set.remove(s.charAt(left)); //if the string's right character is equals to the set's 
        //         left++;
        //     }
        //     max = Math.max(max, right - left +1); 
        // }
        // return max; }

    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println("The length of longest sub string is: " +new longestSubString().longestSubString(s));
    }   
}