package leetcode.Array;
import java.util.HashMap;
import java.util.Map;

public class numIdenticalPairs {
    public int pairs(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        int pairs = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1); //(1,1), (2,1), (3,1), (1,2), (1,3), (3,2)
            pairs += map.get(num) - 1; //pairs = 0 + 0 + 0 + 1 + 2 + 1 => 4
        } //subtract 1 from the count because we're interested in the number of good pairs,
         //and including the current occurrence of num would result in a pair with itself, which is not a good pair.
        return pairs; //4
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println("The number of identical pairs are " +new numIdenticalPairs().pairs(nums));
    }
}
