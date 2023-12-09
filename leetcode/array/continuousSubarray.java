package leetcode.Array;
import java.util.HashMap;

//A good subarray is a subarray where it's length is at least two, and the sum of the elements of the subarray is a multiple of k.
public class continuousSubarray {
    public boolean subArr(int[] arr, int k){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        numMap.put(0,0);

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(numMap.containsKey(sum % k)){
                if(numMap.get(sum % k) < i){
                    return true;
                }
            }
                else{
                    numMap.put(sum % k, i + 1);
                }
            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23,2,4,6,7};
        int k = 6;
        System.out.println("Good Subarray: " +new continuousSubarray().subArr(arr, k));
    }
}
