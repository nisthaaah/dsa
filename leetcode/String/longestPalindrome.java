package leetcode.String;

public class longestPalindrome {
    public String longestPalindrome(String s){
        int start = 0;
        int maxLen = 0;

        for(int i = 1; i < s.length(); i++){

            //odd
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int len = right - left + 1;
                if(len > maxLen){
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }

            //even
            left = i-1; 
            right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int len = right - left + 1;
                if(len > maxLen){
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }
        } //Expand Around Center approach
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args){
        String s = "cabad";
        System.out.println("The longest palindromic Substring is: " +new longestPalindrome().longestPalindrome(s));
    }    
}