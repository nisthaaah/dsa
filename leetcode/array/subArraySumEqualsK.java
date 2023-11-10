package leetcode.Array;
import java.util.HashMap;
import java.util.Map;

public class subArraySumEqualsK {
    public int subArraySum(int[] arr, int k){
        int sum = 0;
        int count = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num : arr){
            sum += num;
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println("The number of sub arrays with sum " +k+ ": " +new subArraySumEqualsK().subArraySum(arr, k));
    }
}