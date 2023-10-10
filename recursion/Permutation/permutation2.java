package recursion.Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation2 {
    public static List<List<Integer>> permutate2(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backTrack(nums, res, new ArrayList<>(), used);
        return res;
    }

    public static void backTrack(int[] nums, List<List<Integer>> res, List<Integer> curr, boolean[] used){
        if(curr.size() == nums.length && !res.contains(curr)){
            res.add(new ArrayList<>(curr));
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue; //skip the used elements

            curr.add(nums[i]);
            used[i] = true;

            backTrack(nums, res, curr, used);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permutate2(nums));
    }
}