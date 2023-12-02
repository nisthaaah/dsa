package leetcode.String;
import java.util.HashMap;
import java.util.Map;

public class countCharacters {
    public int count(String[] words, String chars) {
        int res = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        for(char c : chars.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        for(String word : words){
            if(canForm(word, charFreq)){
                res += word.length();
            }
        }
        return res;
    }

    public boolean canForm(String word, Map<Character, Integer> charFreq){
        Map<Character, Integer> wordsFreq = new HashMap<>();
        for(char c : word.toCharArray()){
            wordsFreq.put(c, wordsFreq.getOrDefault(c,0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : wordsFreq.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            if(!charFreq.containsKey(c) || charFreq.get(c) < count){
                return false;
            }
        }
        return true;
        
    //     int res = 0;
    //     for (String word : words) {
    //         if (canFormWord(word, chars)) {
    //             res += word.length();
    //         }
    //     }
    //     return res;
    // }

    // public boolean canFormWord(String word, String chars) {
    //     int[] charCount = new int[26];

    //     for(char c : chars.toCharArray()){
    //         charCount[c - 'a']++;
    //     }
    //     for(char c : word.toCharArray()){
    //         if(charCount[c - 'a'] == 0){
    //             return false;
    //         }
    //         charCount[c - 'a']--;
    //     }
    //     return true;
    }

    public static void main(String[] args) {
        String[] words = {"hat", "cat", "bt", "tree"};
        String chars = "atach";

        System.out.println("The length of words that can be formed from by characters: " +new countCharacters().count(words, chars));
    }
}
