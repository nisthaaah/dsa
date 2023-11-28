package leetcode.Random.isPower;

public class isPower3 {
    public boolean isPower3(int n){
        if(n <= 0) return false;
        while(n % 3 == 0){
            n /= 3; //9 || 3 || 1
        }
        return n == 1; //true
    }
    public static void main(String[] args) {
        int n = 27;
        System.out.println("The integer " +n+ " is a power of 3: " +new isPower3().isPower3(n));
    }
}