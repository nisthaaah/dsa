package leetcode.HashMap;
import java.util.*;

public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){ //nums 2 = [1,3,4,2]
                map.put(stack.pop(), num); //(1, 3), (3, 4)
            }
            stack.push(num); //3, 4, 2
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1); //(2, -1), (4, -1)
        }

        int[] res = new int[nums1.length]; //[4,1,2]
        for(int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]); //res = (-1, 3, -1)
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int res[] = new nextGreaterElement().nextGreaterElement(nums1, nums2);

        for(int num: res){
            System.out.print(num + " ");
        }
    }
}