package leetcode.Random;

public class reverseInteger {
    public int reverse(int x){
        int reversed = 0;
        while(x != 0){
            int rev = x % 10; //rev = 3 // rev = 2 //rev = 1
            x /= 10; //12 //1 //0

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && rev > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && rev < -8)) {
                return 0;
            } //to check for integer overflow during the reverse operation

            reversed = reversed * 10 + rev; // 0 * 10 + 3 => 3 2 1
        }
        return reversed; //3 2 1
    }
    public static void main(String[] args){
        int n = 123;
        System.out.println("The reversed integer is: " +new reverseInteger().reverse(n));
    }
}
