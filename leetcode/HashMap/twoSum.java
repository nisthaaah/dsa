package leetcode.HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int arr[], int target){
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int complement = target - num;
            if(numMap.containsKey(complement)){
                return new int[] {numMap.get(complement), i};
            }
            else numMap.put(num, i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] res = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("The indices of two numbers in the array that add up to the target: " + Arrays.toString(res));
    }
    
}
