package leetcode.BitManipulation;

public class hamminWeight {
    public int hamminWeight(int n){
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args){
        hamminWeight h = new hamminWeight();
        int n = 2; //
        //String binaryInput = "10110000000000000";
        //int n = Integer.parseUnsignedInt(binaryInput, 2); //radix:2 indicates that the input is in binary format.

        System.out.println("Input: " +n);
        System.out.println("The number of '1' bits: " +h.hamminWeight(n));
        //System.out.println("Reversed: " + b.reverseBits(n));
    }
    
}
