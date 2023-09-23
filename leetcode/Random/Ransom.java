package leetcode.Random;

public class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26]; 

        // Count the character frequencies in the magazine
        for (char c : magazine.toCharArray()) { //aab
            charCount[c - 'a']++; //charCount[]
        }

        // Check if the ransom note can be constructed
        for (char c : ransomNote.toCharArray()) {
            int index = c - 'a';
            if (charCount[index] == 0) {
                return false;
            }
            charCount[index]--;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println("Each letter in magazine can only be used once in ransomNote: " +new Ransom().canConstruct(ransomNote, magazine) );
    }
}
