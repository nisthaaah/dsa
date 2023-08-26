package leetcode.HashSet;
import java.util.*;

public class containsDuplicates {
    public boolean containsDup(int[] nums){
    Set<Integer> mySet = new HashSet<>();
    for(int num : nums){
        if(mySet.contains(num)) return true;
        else mySet.add(num);
    }
    return false;
}
public static void main(String[] args){
    int[] nums = {1,2,3,4};
    System.out.println("The array contains duplicates?\n" +new containsDuplicates().containsDup(nums));
    }
}