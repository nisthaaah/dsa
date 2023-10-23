package leetcode.Random.isPower;

public class isPower2 {
    public boolean isPower2(int n){
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("The integer " +n+ " is a power of 4: " +new isPower2().isPower2(n));
    }
}