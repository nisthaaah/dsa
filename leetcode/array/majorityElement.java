package leetcode.Array;

public class majorityElement {
    public int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0; //Moore Vooting Algorithm

        for(int num : nums){
            if(count == 0){
                candidate = num; //candidate = 1
            }
            if(num == candidate){
                count++; //1, 0, 0
            }
            else{
                count--; //0, -1, -1
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,1};
        System.out.println("The majority element is: " +new majorityElement().majorityElement(nums)); //default constructor
    }
}