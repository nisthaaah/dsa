package recursion;
import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning {
    public static List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        backTrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    public static void backTrack(String s, int start, List<String> curr, List<List<String>> res){
        if(start == s.length()){
            res.add(new ArrayList<String>(curr));
            return;
        }

        for(int end = start + 1; end <= s.length(); end++){
            String subStr = s.substring(start, end);
            if(isPalindrome(subStr)){
                curr.add(subStr);
                backTrack(s, end, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aa";
        System.out.println("The possible palindrome partitioning of string " +s +": " +partition(s));
    }
}