package recursion;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s, int start, int end){
        s= s.toLowerCase();
        if (start >= end) return true;
        if(s.charAt(start) == s.charAt(end)){
            return isPalindrome(s, start+1, end-1);
        }
        else return false;
    }
    // public static boolean isPalindrome(int n, int start, int end){
    //     String s= Integer.toString(n);
    //     if (start >=end) return true;
    //     if(s.charAt(start) == s.charAt(end)){
    //         return isPalindrome(s, start+1, end-1);
    //     }
    //     else return false;
    // }


     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s=sc.nextLine(); 
        System.out.println(isPalindrome(s, 0, s.length()-1));  
     }     
    
}
