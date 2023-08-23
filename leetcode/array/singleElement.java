package leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class singleElement {
    public int singleElement(int[] arr){
        int result = 0;
        for(int num : arr){
            result = result ^ num; //using XOR operation
        }
        return result;
    } //Time Complexity: O(n) and Space Complexity: O(1)

    // public int singleElement(int[] nums) {
    //     Map<Integer, Integer> count = new HashMap<>();
    //     for(int i : nums){
    //         count.put(i, count.getOrDefault(i, 0) +1);
    //     }
    //     for(int i : nums){
    //         if(count.get(i) == 1){
    //             return i;
    //         }
    //     }
    //     return -1;
    // } //Time Complexity: O(n) and Space Complexity: O(n)

    public static void main(String[] args){
        singleElement s = new singleElement();
        int[] arr = {1,1,6,4,4};
        System.out.println("The element that appears only once is: " +s.singleElement(arr));
    } 
}
