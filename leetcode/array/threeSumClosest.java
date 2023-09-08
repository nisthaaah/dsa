package leetcode.Array;
import java.util.Arrays;

public class threeSumClosest {
    public int threeSumClosest(int[] arr, int target){
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] +arr[2];

        for(int i = 0; i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(Math.abs(target - sum) < Math.abs(target - closestSum)){
                    closestSum = sum;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args){
        int[] arr = {-1,2,1,-4};
        int target = 1;

        System.out.println("The three sum closest is: " +new threeSumClosest().threeSumClosest(arr, target));
    }
}