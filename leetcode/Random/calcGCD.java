package leetcode.Random;

public class calcGCD {
    public int calcGcd(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 36;
        System.out.println("The GCD of " +n1+ " and " +n2+ ": " +new calcGCD().calcGcd(n1, n2));
    }
}