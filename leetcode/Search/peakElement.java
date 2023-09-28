package leetcode.Search;

public class peakElement {
    public int findPeakElement(int[] nums){
        int low = 0; 
        int high = nums.length - 1; //3

        while(low < high){
            int mid = (low + high) / 2; //1 || 2
            if(nums[mid] > nums[mid + 1]){ //remove right side
                high = mid; //high = 2
            }
            else{ //remove left side
                low = mid + 1; //low = 2 
            }
        }
        return low; //2 -> 3
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println("The peak element is " +new peakElement().findPeakElement(nums));
    }
}