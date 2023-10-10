package recursion.Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static List<List<Integer>> subsetUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums, res, new ArrayList<>(), 0);
        return res;
    }

    public static void backTrack(int[] nums, List<List<Integer>> res, ArrayList<Integer> curr, int start){
        res.add(new ArrayList<>(curr));

        for(int i = start; i < nums.length; i++){
            if(i > start &&         nums[i] == nums[i - 1]) continue; //skip the duplicates
            curr.add(nums[i]);
            backTrack(nums, res, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println("The subset for the given array is: " +subsetUnique(nums));
    }
}
