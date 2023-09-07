package leetcode.Array;

public class rangeSum {
public int rangeSum(int[] nums, int left, int right){
    int sum = 0;
    while(left <= right){
        sum += nums[left];
        left++;
    }
    return sum;
}
public static void main(String[] args){
    rangeSum rs = new rangeSum();
    int[] nums = {-1, -2, 1, 2, 4};
    int left = 1;
    int right = 3;
    System.out.println("The Range Sum is: " +rs.rangeSum(nums, left, right));
   }
}