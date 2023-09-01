package leetcode.Random;
import java.util.*;

public class letterCombinationofPhone {
    public List<String> letterCombination(String digits){
        List<String> res = new ArrayList<>();
        Map<Character, String> dial = new HashMap<>();
        dial.put('2', "abc"); //dial.get(digits.charAt(0) = 2
        dial.put('3', "def"); //dial.get(digits.charAt(1) = 3
        dial.put('4', "ghi");
        dial.put('5', "jkl");
        dial.put('6', "mno");
        dial.put('7', "pqrs");
        dial.put('8', "tuv");
        dial.put('9', "wxyz");

        backTrack(digits, 0, dial, new StringBuilder(), res);
        return res;
    }
    private static void backTrack(String digits, int i, Map<Character, String> dial, StringBuilder sb, List<String> res){
        if(i == digits.length()){ // 2
            res.add(sb.toString());
            return;
        }
        String curr = dial.get(digits.charAt(i)); //curr = "abc" || curr = "def" 
        for(int k = 0; k < curr.length(); k++){ 
            sb.append(curr.charAt(k)); //[ad, ae, af, bd, be, bf, cd, ce, cf]
            backTrack(digits, i + 1, dial, sb, res); //(digits, 0 + 1, dial, sb, res)
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args){
        String digits = "23";
        System.out.println("The combinations are: " +new letterCombinationofPhone().letterCombination(digits));
    }
}