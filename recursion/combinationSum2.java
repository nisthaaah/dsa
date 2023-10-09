package recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static List<List<Integer>> combination(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums, target, new ArrayList<>(), res, 0);
        return res;
    }

    public static void backTrack(int[] nums, int target, ArrayList<Integer> curr, List<List<Integer>> res, int start){
        if(target < 0) return;
        else if(target == 0) res.add(new ArrayList<>(curr));
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i - 1]) continue;
                curr.add(nums[i]);
                backTrack(nums, target - nums[i], curr, res, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println("The combinations that sum up to " +target +": " +combination(nums, target));
    }
}