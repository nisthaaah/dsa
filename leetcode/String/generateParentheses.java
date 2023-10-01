package leetcode.String;
import java.util.*;

public class generateParentheses {
    public List<String> generateParentheses(int n){
        List<String> res = new ArrayList<>();
        backTrack(res, 0, 0, "", n);
        return res;
    }

    public void backTrack(List<String> res, int open_count, int close_count, String s, int n){
        if(s.length() == n * 2){ //6
            res.add(s);
            return;
        }
        if(open_count < n){
            backTrack(res, open_count + 1, close_count, s + "(", n); //[ (, ]
        }
        if(close_count < open_count){
            backTrack(res, open_count, close_count + 1, s + ")", n);
        }
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println("The generated parentheses for " +n+ " are: " +new generateParentheses().generateParentheses(n));
    }   
}
//                              (
//                   ((                    ()
//               (((    (()              ()(
//             ((()  (()(  (())        ()(( ()()
//           ((())  (()()   (())(     ()(()   ()()(
//          ((())) (()())    (())()  ()(())    ()()()