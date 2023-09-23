package leetcode.Random;

public class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26]; 

        for (char c : magazine.toCharArray()) { //aab
            charCount[c - 'a']++; //to convert a lowercase character c into an index relative to the alphabet
        } //charCount[0] -> 2, charCount[1] -> 1
        
        for (char c : ransomNote.toCharArray()) { //aa
            int index = c - 'a'; //0
            if (charCount[index] == 0) return false;
            charCount[index]--; //charCount[0] -> 1, 0
        }

        return true; //true, ransomNote can be constructed by using magazine
    }

    public static void main(String[] args) {
        String ransomNote = "abb"; //to be constructed
        String magazine = "aab"; //to be used for constructing

        System.out.println("Can each letter in magazine be used to construct ransomNote: " +new Ransom().canConstruct(ransomNote, magazine) );
    }
}
