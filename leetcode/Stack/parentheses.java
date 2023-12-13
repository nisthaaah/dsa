package leetcode.Stack;
import java.util.Stack;

public class parentheses {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                myStack.push(c);
            }
            else{
                if(myStack.isEmpty()) return false;
                
                char top = myStack.peek();
                if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')){
                    myStack.pop();
                }
                else return false;
            }
        }
        return myStack.isEmpty();
    }
    public static void main(String[] args){
        String s = "[](){";
        System.out.println("The String is valid: "+isValid(s));
    }
}