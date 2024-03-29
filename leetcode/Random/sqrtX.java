package leetcode.Random;

public class sqrtX {
    public static int mySqrt(int x){
        if (x==0 || x==1) return x;
        long left = 1;
        long right = x / 2; //8 / 2 = 4
        
        while(left <= right){
            long mid = (left + right) / 2; //mid = 1+4 / 2 = 2 || mid = 3+4 / 2 = 3|| mid = 3+3 / 2 = 3
            long square = mid * mid; //4 || 9 || 9

            if(square == x){
                return (int) mid;
            }
            else if(square < x){
                left = mid + 1; //left = 2+1 = 3
            }
            else{
                right = mid - 1; //right = 4-1 = 3 || right = 3-1 = 2
            }
        }
        return (int) right; //2
    }
    public static void main(String[] args){
        int x = 8;
        System.out.println("Sqrt of " + x +" is: "+mySqrt(x));
    }
}
