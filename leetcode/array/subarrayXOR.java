package leetcode.Array;
import java.util.HashMap;
import java.util.Map;

public class subarrayXOR {
    public int xor(int[] nums, int num){
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int count = 0;
        int xorSum = 0;

        for(int i = 0; i < nums.length; i++){
            xorSum ^= nums[i];

            if(freq.containsKey(xorSum ^ num)){
                count += freq.get(xorSum ^ num);
            }
            freq.put(xorSum, freq.getOrDefault(0, 1));
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,2,6,4};
        int num = 6;
        System.out.println("The total number of subarrays having bitwise XOR of all elements equals to B: " +new subarrayXOR().xor(nums, num));
    }
}
