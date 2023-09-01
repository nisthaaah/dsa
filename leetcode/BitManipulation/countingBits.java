package leetcode.BitManipulation;

public class countingBits {
    public int[] count(int n){
        int[] result = new int[n + 1]; //4
        for(int i = 0; i <= n; i++){ //0
            result[i] = Integer.bitCount(i); //result[0] = 0 || result[1] = 1 || result[2] = 1 0 (1) || result[3] = 1 1 (2)
        }
        return result; //0 1 1 2
    }

    public static void main(String[] args){
        int n = 3;
        int[] result = new countingBits().count(n);
        System.out.println("The binary respresentation of " +n+ " is: ");
        for(int num : result){
            System.out.println(num);
        }
    }
}