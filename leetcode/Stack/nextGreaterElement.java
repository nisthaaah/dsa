package leetcode.Stack;
import java.util.*;

public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(i < n){
                if(!st.isEmpty()){
                    res[i] = st.peek();
                }
                else{
                    res[i] = -1;
                }
            }
            st.push(nums[i]);
        }
        return res;
    }   
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] res = new nextGreaterElement().nextGreaterElement(nums);
        System.out.println("The resultant array is: ");
        for(int num : res){
            System.out.print(num +" ");
        }
    }
}
