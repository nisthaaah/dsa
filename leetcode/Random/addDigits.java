package leetcode.Random;

public class addDigits {
    public int add(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10; //sum = 78 % 10 = 8 || sum = 8 + 7 => 15 || sum = 0 + 5 => 5 || sum = 5 + 1 => 6
            num /= 10; //num = 7 || num = 0 || num = 1 || num = 0

            if(num ==0 && sum > 9){ 
                num = sum; //num = 15
                sum = 0;
            }
        }
        return sum; //6
    }
    public static void main(String[] args){
        int num = 78;
        System.out.println("The addition is: " +new addDigits().add(num));
    }
}