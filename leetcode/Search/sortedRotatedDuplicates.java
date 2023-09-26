package leetcode.Search;

public class sortedRotatedDuplicates {
    public int searchDup(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1; //4

        while(low <= high){
            int mid = (low + high) / 2; //2 || 2

            if(nums[mid] == target) return mid + 1; //3

            if(nums[mid] == nums[low] && nums[mid] == nums[high]){ //to handle duplicates
                low++; //1
                high--; //3
                continue; //[6,7,7]
            }

            else if(nums[mid] >= nums[low]){ //left is sorted
                if(nums[mid] > target && target >= nums[low]){
                    high = mid - 1; 
                }
                else{
                    low = mid + 1;
                }
            }
            else{ //right is sorted 
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1; 
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {7,6,7,7,7};
        int target = 7;

        System.out.println("The element is at position: " +new sortedRotatedDuplicates().searchDup(nums, target));
    }
}
