package leetcode.Array;

public class maxProductSubarray {
    public int maxProduct(int[] nums){
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){ //2,3,-2,4
            product *= nums[i]; //product = 2, 6, -12, -48
            if(product > maxProduct) maxProduct = product; //maxProduct = 6
            if(nums[i] == 0) product = 1;
        }

        product = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            product *= nums[i]; //product = 4, -8, -24, -48
            if(product > maxProduct) maxProduct = product; //maxProduct = 6
            if(nums[i] == 0) product = 1;
        }
        return maxProduct; //6
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println("The maximum product is " +new maxProductSubarray().maxProduct(nums));
    }
}