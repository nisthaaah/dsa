package leetcode.HashMap;
import java.util.*;

//Given an integer array nums and an integer k,
//return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

public class containsDuplicate {
    public boolean containsDup(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){ // Math.abs(0 - 3) <= 3
                return true;
            }
            else{
                map.put(nums[i], i); // <1, 0> || <2, 1> || <3, 2> || 
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println("\n" +new containsDuplicate().containsDup(nums, k)+ "\n");
    }  
}