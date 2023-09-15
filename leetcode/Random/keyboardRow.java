package leetcode.Random;
import java.util.*;

public class keyboardRow {
    public String[] findWords(String[] words){
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";

        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();

        for(int i = 0; i < one.length(); i++){
            row1.add(one.charAt(i));
        }
        for(int i = 0; i < two.length(); i++){
            row2.add(two.charAt(i));
        }
        for(int i = 0; i < three.length(); i++){
            row3.add(three.charAt(i));
        }

        List<String> res = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;

            for(int j = 0; j < word.length(); j++){
                if(row1.contains(word.charAt(j))){
                    r1++;
                }
                if(row2.contains(word.charAt(j))){
                    r2++;
                }
                if(row3.contains(word.charAt(j))){
                    r3++;
                }

                if(r1 == word.length() || r2 == word.length() || r3 == word.length()){
                    res.add(word);
                }
            }
        }
        String[] result = new String[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args){
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] res = new keyboardRow().findWords(words);
        
        for(String word : res){
            System.out.println(word);
        }
    }
}
