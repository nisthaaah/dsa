package leetcode.Strings;

public class isPalindrome {
    public boolean isPalindrome(String s){
        s= s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while(start < end){

            if(!Character.isLetterOrDigit(s.charAt(start))) start++;
            else if(!Character.isLetterOrDigit(s.charAt(end))) end--;
            else{
                if(s.charAt(start) != s.charAt(end)) return false;
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        isPalindrome p = new isPalindrome();
        
        String s1 = "race a car";
        String s2 = "A man, a plan, a canal, Panama";
        System.out.println("Is palindromic: "+ p.isPalindrome(s1));
        System.out.println("Is palindromic: "+ p.isPalindrome(s2));
    }
}
