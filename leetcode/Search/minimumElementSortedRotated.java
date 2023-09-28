package leetcode.Search;

public class minimumElementSortedRotated {
    public int minimumElement(int[] nums){
        int low = 0;
        int high = nums.length - 1; //4
        while(low < high){
            int mid = (low + high) / 2; //2 || 3
            if(nums[mid] > nums[high]){
                low = mid + 1; //low = 3
            }
            else{ //nums[mid] < nums[high]
                high = mid; //3
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println("The minimum element is " +new minimumElementSortedRotated().minimumElement(nums));
    }
}