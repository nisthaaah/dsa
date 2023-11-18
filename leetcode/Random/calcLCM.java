package leetcode.Random;

public class calcLCM {
    public int calcLcm(int n1, int n2){
        int gcd = calcGCD(n1, n2);
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }

    public int calcGCD(int n1, int n2){
        //recursively
        if(n2 == 0){
            return n1;
        }
        return calcGCD(n2, n1 % n2);

        // while(n2 != 0){
        //     int temp = n2;
        //     n2 = n1 % n2;
        //     n1 = temp;
        // }
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 12;
        System.out.println("The LCM of " +n1+ " and " +n2+ ": " +new calcLCM().calcLcm(n1, n2));
    }
}
