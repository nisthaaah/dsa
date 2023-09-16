import java.util.*;

public class arrayPartition {
    public int arrayPartition(int[] nums){ //1,2,2,5,6,6
        Arrays.sort(nums); //1,2,3,4
        int sum = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            sum+= nums[i]; // sum 0 + 1 = 1 || sum = 1 + 3 = 4
        } //sum = 1 || sum = 3 || sum = 9
        return sum; //4
    }

    public static void main(String[] args){
        //int[] nums = {1,4,3,2};
        int[] nums = {6,2,6,5,1,2};
        System.out.println("The maximum possible sum is: " +new arrayPartition().arrayPartition(nums));
    }
}