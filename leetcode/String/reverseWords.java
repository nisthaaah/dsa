package leetcode.String;

public class reverseWords {
    public String reverse(String s){
        // int i = 0;
        // int j = s.length() - 1;
        s = s.trim();

        String[] words = s.split("\\s+"); //splits a string s into an array of substrings based on one or more whitespace characters

        StringBuilder res = new StringBuilder();
        for(int k = words.length - 1; k > 0; k--){
            res.append(words[k]).append(" ");
        }
        return res.append(words[0]).toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println("The reversed String: " +new reverseWords().reverse(s));
    }
}
