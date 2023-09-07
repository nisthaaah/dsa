package leetcode.Array;

public class thirdMaximum {
    public int thirdMaximum(int[] nums){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num : nums){
            if(num == first || num == second || num == third) continue;

        if(num > first){ //1
            third = second;  //                      || third = 1  || third = 2                      
            second = first; //         || second = 1 || second = 2 || second = 3
            first = num;   //first = 1 || first = 2  || first = 3  || first = 4
        }
        else if(num > second){
            third = second;
            second = num;
        }
        else{
            third = num;
        }
    }

    if(third == Long.MIN_VALUE || second == Long.MIN_VALUE){
        return (int) first;
    }
    return (int) third; //2
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println("The maximum number is: " +new thirdMaximum().thirdMaximum(nums));
    }
}