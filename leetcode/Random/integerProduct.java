package leetcode.Random;

public class integerProduct {
    public int product(int n){
        if(n <= 3) return n - 1;

        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return n * res;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The maximum product you can get is " +new integerProduct().product(n));
    }
}