package leetcode.String;
import java.util.HashMap;
import java.util.Map;

public class validAnagram {  //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char c : s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        return sMap.equals(tMap);

        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println("Is Anagram: " +new validAnagram().isAnagram(s, t));

    }
}