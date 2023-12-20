package leetcode.Array;
import java.util.Arrays;

public class largestNumber {
    public String largest(int[] nums){
        int n  = nums.length;
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for(String str : s){
            sb.append(str);
        }
        String res = sb.toString();
        return res.startsWith("0") ? "0" : res;
    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println("The largest number: " +new largestNumber().largest(nums));
    }
}