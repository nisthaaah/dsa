package leetcode.Strings;
import java.util.*;

public class removeDuplicateLetters {
    public String remove(String s){
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            lastOccurrence.put(s.charAt(i), i);
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(seen.contains(s.charAt(i))) continue;

        while(!stack.isEmpty() && s.charAt(i) < stack.peek() && i < lastOccurrence.getOrDefault(stack.peek(), -1)){
            seen.remove(stack.pop());
        }
        seen.add(s.charAt(i));
        stack.push(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();
        for(char c : stack){
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println("The String after removing duplicates(lexicographical order) is: " +new removeDuplicateLetters().remove(s));
    }
}