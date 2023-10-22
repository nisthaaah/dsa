package leetcode.Stack;
import java.util.Stack;

public class makeMinValidParentheses {
    public int minValid(String s){
    Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == ')'){
                if(!s.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else{
                st.push(c);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        String s = "((())";
        System.out.println("The minimum number of moves required to make s valid: " +new makeMinValidParentheses().minValid(s));
    }
}