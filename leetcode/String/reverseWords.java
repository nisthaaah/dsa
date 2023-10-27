package leetcode.String;

public class reverseWords {
    public String reverse(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j && s.charAt(i) == ' ') i++;
        while(j >= i && s.charAt(j) == ' ') j--;
        s.substring(i, j + 1);

        String[] words = s.split("\\s+");

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
