package leetcode.Array;
import java.util.*;

public class majorityElement2 {
    public List<Integer> majorityElement(int[] nums){
        List<Integer> res = new ArrayList<>();
        int count1 = 0; int count2 = 0;
        int element1 = Integer.MIN_VALUE; int element2 = Integer.MIN_VALUE;

        for(int num : nums){ //[1, 1, 2]
            if(num == element1){
                count1++; //2
            }
            else if(num == element2){
                count2++; 
            }
            else if(count1 == 0){
                element1 = num; //1
                count1 = 1; //1
            }
            else if(count2 == 0){
                element2 = num; //2
                count2 = 1; //1
            }
            else{
                count1--; 
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num == element1){
                count1++; //2
            }
            if(num == element2){
                count2++; //1
            }
        }

        if(count1 > nums.length / 3){ //1
            res.add(element1);
        }
        if(count2 > nums.length / 3){
            res.add(element2); //1
        }
        return res; //[1]
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};

        System.out.println("The majority element is: " +new majorityElement2().majorityElement(nums));
    }
}