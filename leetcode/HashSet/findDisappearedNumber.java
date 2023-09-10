package leetcode.HashSet;
import java.util.*;

public class findDisappearedNumber {
    public List<Integer> disappearedNumber(int[] nums){
        List<Integer> res = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for(int n : nums){
            numSet.add(n); //[1,3,4,6,7]
        }
        for(int i = 1; i <= nums.length; i++){ //6
            if(!numSet.contains(i)){ 
                res.add(i); //[2, 5]
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,3,4,6,7,1};

        System.out.println("The disappeared numbers are: " +new findDisappearedNumber().disappearedNumber(nums));
    }
}