package leetcode.Search;

public class sortedRotatedUnique {
    public int searchUniq(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1; //5

        while(low <= high){
            int mid = (low + high) / 2; //2 || 0 || 1

            if(nums[mid] == target) return mid + 1; //2

            if(nums[mid] >= nums[low]){ //left is sorted
                if(nums[mid] > target && target >= nums[low]){
                    high = mid - 1; // high = 1
                }
                else{
                    low = mid + 1;
                }
            }
            else{ //right is sorted 
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1; //low = 1
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {6,7,0,1,2,3};
        int target = 7;

        System.out.println("The element is at position: " +new sortedRotatedUnique().searchUniq(nums, target));
    }
}