package leetcode.String;

public class removeOutermostParentheses {
    public String remove(String s){
        if(s.length() <= 2) return " ";
        StringBuilder newS = new StringBuilder();

        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
                if(open > 1) newS.append('(');
            }
            else{
                if(open > 1) newS.append(')');
                open--;
            }
        }
        return newS.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println("The new String without outermost parentheses: " +new removeOutermostParentheses().remove(s));
            
    }
}
