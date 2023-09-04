package leetcode.Random;

public class missingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int total = (n * (n-1)) / 2;

        for(int num : nums){
            total = total - num;
        }
        return total;
    }
    public static void main(String[] args){
        int[] nums = {1,3,4,5,6};
        System.out.println("The missing number is: " +new missingNumber().missingNumber(nums));
    }
}