package leetcode.Stack;

import java.util.Stack;

public class oneThreeTwoPattern {
    public boolean pattern(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < third) return true; //pattern : 1,4,2

            while(!stack.isEmpty() && stack.peek() < nums[i]){
                third = stack.pop(); //2
            }
            stack.push(nums[i]); //2 || 4
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        System.out.println("The arrays contains the pattern: " +new oneThreeTwoPattern().pattern(nums));
    }
}