package leetcode.Array;

public class nextPermutation {
    public static void nextPerm(int[] nums) {
        int i1 = -1;
        int i2 = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                i1 = i;
                break;
            }
        }
        if(i1 == -1){
            reverse(nums, 0);
        }
        else{
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[i1]){
                    i2 = i;
                    break;
                }
            }
            swap(nums, i1, i2);
            reverse(nums, i1 + 1);
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start){
        int left = start;
        int right = nums.length - 1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        nextPerm(nums);

        System.out.print("Next Permutation: ");
            for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
