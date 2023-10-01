package leetcode.Stack;
import java.util.*;

public class nextGreaterElement2 { //circular array
    public int[] nextGreaterElement2(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 2*n - 1; i >=0; i--){
            while(!s.isEmpty() && s.peek() <= nums[i % n]){
                s.pop();
            }
            if(i < n){
                if(!s.isEmpty()){
                    res[i] = s.peek();
                }
                else{
                    res[i] = -1;
                }
            }
            s.push(nums[i % n]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] res = new nextGreaterElement2().nextGreaterElement2(nums);
        System.out.println("The resultant array is: ");
        for(int num : res){
            System.out.print(num +" ");
        }
    }
}