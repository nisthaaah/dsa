package leetcode.BitManipulation;

public class hamminWeight {
    public int hamminWeight(int n){
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){ //1
                count++; //2
            }
            n >>= 1; //011 || 001 || 000
        }
        return count;

        // int count = 0;
        // while (n != 0) {
        //     n = n & (n - 1); //6(110) & 5(101) => 101 || 5 & 4 => 4 || 4 & 3 => 0
        //     count++; //2
        // }
        // return count;
    }
    public static void main(String[] args){
        hamminWeight h = new hamminWeight();
        int n = 6; //011
        //String binaryInput = "10110000000000000";
        //int n = Integer.parseUnsignedInt(binaryInput, 2); //radix:2 indicates that the input is in binary format.

        System.out.println("Input: " +n);
        System.out.println("The number of '1' bits: " +h.hamminWeight(n));
        //System.out.println("Reversed: " + b.reverseBits(n));
    }
    
}
