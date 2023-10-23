package leetcode.Random.isPower;

public class isPower4 {
    public boolean isPower4(int n){
        if(n == 1) return true;
        if(n <= 0) return false;
        double base4 = Math.log(n) / Math.log(4);
        return (base4 == (int)base4);
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println("The integer " +n+ " is a power of 4: " +new isPower4().isPower4(n));
    }
}