package leetcode.String;

import java.util.Arrays;

public class longestPrefix {
    public static String longestPrefix(String[] arr){
        Arrays.sort(arr); //{flight, flow, flower}
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            else break;
        }
        return s1.substring(0,i);
    
    }

    public static void main(String[] args){
        String[] arr = {"flower","flow","flight"};
        System.out.println("Longest Prefix: " +longestPrefix(arr));
    }
    
}
