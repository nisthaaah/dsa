package leetcode.Random;

public class palindromeNumber {
    public boolean palindrome(int n){
        if(n < 0) return false;
        int rev = 0;
        int original = n;
        
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return (original == rev);
    }
    public static void main(String[] args) {
        int n = 121;
        System.out.println("The number is palindromic: " +new palindromeNumber().palindrome(n));
    }
}