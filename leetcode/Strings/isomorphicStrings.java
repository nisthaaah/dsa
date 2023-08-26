package leetcode.Strings;
import java.util.*;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;

        Map<Character, Character> charMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMap.containsKey(original)){
                if(!charMap.containsValue(replacement)){
                    charMap.put(original, replacement);
                }
                else return false;
            }
            else{
                char mapped = charMap.get(original);  //If 'charMap' contains the original character, you retrieve the previously mapped 
                if(mapped != replacement){           //replacement character and compare it with the current replacement character.
                    return false; //they are not the same
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "egg";
        String t = "add";

        System.out.println("The strings " +s+ " and " +t+ " are isomorphic?\n" +new isomorphicStrings().isIsomorphic(s, t));
    } 
}