package leetcode.String;

public class strOccu {

    static int countOccurrences(String s, String s1) {
        
        return countHelper(0, 0, s, s1); // Start the recursive helper function.
    }

    static int countHelper(int sIndex, int s1Index, String s, String s1) {
        if (s1Index >= s1.length()) {
            return 1; // If the second string is completed, we found a matching pattern.
        }

        if (sIndex >= s.length()) {
            return 0; // If the first string is completed, we can't find more matching patterns.
        }

        if (s.charAt(sIndex) == s1.charAt(s1Index)) {
            return countHelper(sIndex + 1, s1Index + 1, s, s1) + countHelper(sIndex + 1, s1Index, s, s1);
        }

        return countHelper(sIndex + 1, s1Index, s, s1);
    }

    public static void main(String[] args) {
        String str1 = "ban";
        String str2 = "banana";

        int occurrences = countOccurrences(str2, str1);
        System.out.println("Occurrences of '" + str1 + "' in '" + str2 + "': " + occurrences);
    }
}