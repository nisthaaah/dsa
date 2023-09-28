package leetcode.Array;

public class sortByParity {
    public int[] sort(int[] nums){
        int  even = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                swap(nums, i, even);
                even++;
            }
        }
        return nums;
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums= {3,1,4,2};
        int[] res = new sortByParity().sort(nums);
        System.out.println("The sorted array is: ");
        for(int num : res){
            System.out.print(num +" ");
        }
    }
}