package leetcode.Strings;

public class differentChar {
    public char findDifference(String s, String t){
        // int s1 = 0;
        // int s2 = 0;

        // for(char c : s.toCharArray()){
        //     s1 += c;
        // }
        // for(char c : t.toCharArray()){
        //     s2 += c;
        // }
        // return (char)(s2 - s1);

        char res = 0;
        for(char c : s.toCharArray()) res ^= c;
        for(char c : t.toCharArray()) res ^= c;
        return res;

    }
    public static void main(String[] args) {
        String s = "abcdel";
        String t = "abcde";

        System.out.println("The different character: " +new differentChar().findDifference(s, t));
    }
}
