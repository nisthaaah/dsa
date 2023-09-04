package leetcode.HashMap;
import java.util.*;

public class missingNumber {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int currSum = 0;

        for(int i =0; i < nums.length; i++){
            currSum += nums[i];
        }
        return expectedSum - currSum;
    //     Map<Integer, Integer> numMap = new HashMap<>();

    //     for(int i = 0; i < nums.length; i++){ //3
    //         numMap.put(nums[i], nums[i]); // (3,3) , (0,0), (1,1)
    //     }

    //     for(int i = 0; i < nums.length; i++){
    //     if(numMap.containsKey(i)){
    //         continue;
    //     }
    //     else{
    //         return i; //2
    //     }
    // }
    // return nums.length; //If none of the numbers from 0 to nums.length, returns nums.length (4)
}

public static void main(String[] args){
    int[] nums = {3,0,1};
    System.out.println("The missing number is: " +new missingNumber().missingNumber(nums));
  }
}