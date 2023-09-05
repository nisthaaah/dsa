package leetcode.Array;

public class moveZeros {
    public void moveZeros(int[] nums){
        int i = 0;
        for(int num : nums){ //[0, 1, 0, 3, 4]
            if(num != 0){ 
                nums[i] = num; //nums[0] = 1 [1, 1, 0, 3, 4]
                i++; //1
            }
        }
        while(i <= nums.length - 1){
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 4};
        new moveZeros().moveZeros(nums);
        System.out.print("Modified array: \n");
        for(int num : nums){
            System.out.println(num + " ");
        }
    }
}