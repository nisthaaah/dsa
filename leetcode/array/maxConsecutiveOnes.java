package leetcode.Array;

public class maxConsecutiveOnes {
    public int maxConsecutiveOnes(int[] arr){
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) count++;
            else count = 0;

            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args){
        int[] arr = {1,0,1,1,0,1,2};
        System.out.println("The max consecutive number of ones are: " +new maxConsecutiveOnes().maxConsecutiveOnes(arr));
    }
}