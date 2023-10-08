package leetcode.Stack;
import java.util.Stack;

public class sortStack {
    public static void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sort(stack);
            insertInSorted(stack, temp);
        }
    }

    public static void insertInSorted(Stack<Integer> stack, int val){
        if(stack.isEmpty() || val > stack.peek()){
            stack.push(val);
        }
        else{
            int temp = stack.pop();
            insertInSorted(stack, val);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        stack.push(32);
        stack.push(3);
        stack.push(41);

        System.out.println("Original stack: " +stack);

        sort(stack);
        System.out.println("Sorted stack: " +stack);
    }
}
