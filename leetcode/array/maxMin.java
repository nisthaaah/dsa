package leetcode.Array;
import java.util.Arrays;

public class maxMin {
    public static int[] findMaxMin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
            return new int[] {max, min};
    }
    public static void main(String[] args){
        int arr[] = {4,3,2,1,69,0};
        int[] result=findMaxMin(arr);
        System.out.println("Maximum and the minimum element is " +Arrays.toString(result));
    } 
}
