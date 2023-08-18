package slidingWindow;

public class MaxSumKConsecutive {
    public static int maxSum(int[] arr, int k){
        if(arr.length < k){
                System.out.println("Invalid input");
                return -1;
        }
        int maxSum = 0;
        for(int i=0; i<k; i++){
            maxSum+= arr[i];
        }
        //Sliding Window Approach
        int windowSum = maxSum;
        for(int i=k; i<arr.length; i++){
            windowSum+= arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;

    } 
    public static void main (String args[]){
        int[] arr = {100, 200, 300, 400};
        int k =2;
        System.out.print("Maximum sum of "+ k +" consecutive elements is: " + maxSum(arr, k));
    }
}
