package leetcode.Random.isPower;

public class isPower2 {
    public boolean isPower2(int n){
        if(n <= 0){
            return false;
        }
        // int N = (n & (n - 1));
        // System.out.println(N);
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println("The integer " +n+ " is a power of 2: " +new isPower2().isPower2(n));
    }
}