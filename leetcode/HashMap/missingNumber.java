package leetcode.HashMap;
import java.util.*;

public class missingNumber {
    public int missingNumber(int[] nums){
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){ //3
            numMap.put(nums[i], nums[i]); // (3,3) , (0,0), (1,1)
        }

        for(int i = 0; i < nums.length; i++){
        if(numMap.containsKey(i)){
            continue;
        }
        else{
            return i; //2
        }
    }
    return nums.length;
}

public static void main(String[] args){
    int[] nums = {3,0,1};
    System.out.println("The missing number is: " +new missingNumber().missingNumber(nums));
  }
}