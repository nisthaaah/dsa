package leetcode.Array;
import java.util.*;

public class majorityElement2 {
    public List<Integer> majorityElement(int[] nums){
        List<Integer> res = new ArrayList<>();
        int count1 = 0; int count2 = 0;
        int element1 = 0; int element2 = 0;

        for(int num : nums){ //[1, 2, 2]
            if(count1 == 0){
                element1 = num; //1
                count1 = 1; //1
            }
            else if(count2 == 0){
                element2 = num; //2
                count2 = 1; //1
            }
            else if(num == element1){
                count1++;
            }
            else if(num == element2){
                count2++; //2
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
                count1++; //1
            }
            if(num == element2){
                count2++; //2
            }
        }

        if(count1 > nums.length / 3){ //1
            res.add(element1);
        }
        if(count2 > nums.length / 3){
            res.add(element2); //2
        }
        return res; //[2]
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};

        System.out.println("The majority element is: " +new majorityElement2().majorityElement(nums));
    }
}
