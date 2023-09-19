package leetcode.TwoPointers;

public class findDuplicate {
    public int findDuplicate(int[] nums){
        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow]; //slow = 0, 3, 4, 2
            fast = nums[nums[fast]]; //fast = 0, 4, 1, 2
        } while(slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow]; //slow = 0, 3, 4
            fast = nums[fast]; //fast = 2, 1, 4
        } 
        return slow; //4
    }

    public static void main(String[] args){
        int[] nums = {3,4,1,4,2};

        System.out.println("The duplicate element is: " +new findDuplicate().findDuplicate(nums));
    }
}