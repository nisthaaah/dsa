package leetcode.Stack;

import java.util.Stack;

public class reverseStack {
    public static void reverse(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            reverse(stack);
            insertAtBottom(stack, temp);
        }
    }

        public static void insertAtBottom(Stack<Integer> stack, int value) {
            if(stack.isEmpty()){
                stack.push(value);
            }
            else{
                int temp = stack.pop();
                insertAtBottom(stack, value);
                stack.push(temp);
            }
        }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original stack: " +stack);

        reverse(stack);
        System.out.println("Sorted stack: " +stack);
    }
}
