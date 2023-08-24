package leetcode.Array;

public class majorityElement {
    public int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0; //Moore Vooting Algorithm

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,1,2,1,1};
        System.out.println("The majority element is: " +new majorityElement().majorityElement(nums)); //default constructor
    }  
}