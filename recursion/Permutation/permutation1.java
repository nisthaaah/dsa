package recursion.Permutation;
import java.util.ArrayList;
import java.util.List;

public class permutation1 {
    public static List<List<Integer>> permutate1(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, res, new ArrayList<>());
        return res;
    }

    public static void backTrack(int[] nums, List<List<Integer>> res, List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
        }

        for(int i = 0; i < nums.length; i++){
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            backTrack(nums, res, curr);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4};
        System.out.println(permutate1(nums));
    }
}