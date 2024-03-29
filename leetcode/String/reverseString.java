package leetcode.String;
import java.util.Arrays;

public class reverseString {
    public void reverse(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        char[] s = {'h', 'e', 'l', 'l', 'l', 'o'};
        new reverseString().reverse(s);
        System.out.println("The reversed string is: " +Arrays.toString(s));
    }
}