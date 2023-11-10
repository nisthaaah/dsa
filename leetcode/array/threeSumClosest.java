package leetcode.Array;
import java.util.Arrays;

public class threeSumClosest {
    public int threeSumClosest(int[] arr, int target){
        Arrays.sort(arr); //[-4, -1, 1, 2]
        int closestSum = arr[0] + arr[1] +arr[2]; //-4

        for(int i = 0; i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k]; //-4 + -1 + 2 => -3

                if(Math.abs(target - sum) < Math.abs(target - closestSum)){ //(1 - (-3)) < (1 - (-4)) => 4 < 5 || 2 < 5 || - 1 < 5
                    closestSum = sum; //-3 || -1 || 2
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