package leetcode.String;

public class countCharacters {
    public int count(String[] words, String chars) {
        int res = 0;
        for (String word : words) {
            if (canFormWord(word, chars)) {
                res += word.length();
            }
        }
        return res;
    }

    public boolean canFormWord(String word, String chars) {
        int[] charCount = new int[26];

        for(char c : chars.toCharArray()){
            charCount[c - 'a']++;
        }
        for(char c : word.toCharArray()){
            if(charCount[c - 'a'] == 0){
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"hat", "cat", "bt", "tree"};
        String chars = "atach";

        System.out.println("The length of words that can be formed from by characters: " +new countCharacters().count(words, chars));
    }
}
