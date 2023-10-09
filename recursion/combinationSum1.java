package recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum1 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, new ArrayList<>(), res, target, 0);
        return res;
    }

    public static void backTrack(int[] candidates, ArrayList<Integer> curr, List<List<Integer>> res, int target, int start){
        if(target < 0) return;
        else if(target == 0) res.add(new ArrayList<>(curr));
        else{
            for(int i = start; i < candidates.length; i++){
                curr.add(candidates[i]);
                backTrack(candidates, curr, res, target - candidates[i], i);
                curr.remove(curr.size() - 1);

            }
        }
    }
    // public static void combination(int[] nums, ArrayList<Integer> res, int target, int i){
    //     if(target < 0 || i == nums.length) return;
    //     if(target == 0){
    //         System.out.println("The combinations that sum up to target: " +res);
    //         return;
    //     }
        

    //     res.add(nums[i]);
    //     combination(nums, res, target - nums[i], i);


    //     res.remove(res.size() - 1);
    //     combination(nums, res, target, i + 1);

    // }

    public static void main(String[] args) {
        //ArrayList<Integer> res = new ArrayList<>();
        int[] nums = {2,3,6,7};
        int target = 7;
        System.out.println("The combinations that sum up to " +target +": " +combinationSum(nums, target));

    }
}
