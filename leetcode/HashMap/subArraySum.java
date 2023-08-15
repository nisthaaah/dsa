package leetcode.HashMap;
import java.util.*;

public class subArraySum {
    public static int[] subArraySum(int[] arr, int target){
        Map<Integer, Integer> sumIndex = new HashMap<>();

        sumIndex.put(0, -1); //(sum, index)
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            int key = currSum - target;
            if(sumIndex.containsKey(key)){
                return new int[] {sumIndex.get(key) +1, i};
            }
            else sumIndex.put(currSum, i);
        }
        return new int[]{}; 
    }

    public static void main(String[] args){
        int[] res= subArraySum(new int[]{2, 3, 4, 5, 6}, 3);
        System.out.println("res: "+Arrays.toString(res));
    }
    
}
