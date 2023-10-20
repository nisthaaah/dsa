package leetcode.String;
import java.util.Stack;

public class backspaceStringCompare {
    public static boolean backspaceString(String s, String t){
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }
            else{
                s1.push(c);
            }
        }

        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
            }
            else{
                s2.push(c);
            }
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "abc#";
        System.out.println("The Strings are equal: " +new backspaceStringCompare().backspaceString(s, t));
    }
}