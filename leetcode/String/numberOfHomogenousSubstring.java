package leetcode.String;

public class numberOfHomogenousSubstring {
    public int homogenous(String s){
        int res = s.length();
        int count = 1;
        int MOD = 1000000007;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                res = (res+count) % MOD;
                count++;
            }
            else{
                count = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println("The number of homogenous substrings: " +new numberOfHomogenousSubstring().homogenous(s));
    }
}