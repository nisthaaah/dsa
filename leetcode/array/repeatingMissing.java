package leetcode.Array;
import java.util.*;

public class repeatingMissing {
    public int[] findMissingRepeatingNumbers(int[] nums){
        Set<Integer> mySet = new HashSet<>();

        int repeating = 0;
        int missing = 0;
        for(int num : nums){
            if(!mySet.contains(num)){
                mySet.add(num); //3, 1, 4
            }
            else{
                repeating = num; //repeating = 3
            }
        }

        for(int i = 1; i <= nums.length; i++){
            if(!mySet.contains(i)){ 
                missing = i; //missing = 2
            }
        }
        return new int[] {repeating, missing}; //3, 2
    }

    public static void main(String[] args) {
        int[] nums = {3,1,3,4};

        int[] res = new repeatingMissing().findMissingRepeatingNumbers(nums);

        System.out.println("The repeating and missing element is " +res[0] +", " +res[1] +" respectively");
    }
}
