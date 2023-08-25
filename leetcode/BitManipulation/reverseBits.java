package leetcode.BitManipulation;

public class reverseBits {
    public int reverseBits(int n){
        int result = 0;                        //(result << 1) makes space for the next bit to be added.
        for(int i = 0; i < 32; i++){           // (n & 1) extracts the least significant bit (LSB) of the current n.
            result = (result << 1) | (n & 1);  // | performs a bitwise OR operation, combining the shifted result and the extracted LSB.
            n = n >> 1;  // effectively removing the least significant bit that was just added to result.
        }   
        return result;
    }
    public static void main(String[] args){
        reverseBits b = new reverseBits();
        //int n = 11;
        String binaryInput = "10110000000000000000000000000000";
        int n = Integer.parseUnsignedInt(binaryInput, 2); //radix:2 indicates that the input is in binary format.
       
        System.out.println("Input: " +binaryInput);
        System.out.println("Reversed: " + Integer.toBinaryString(b.reverseBits(n)));
        //System.out.println("Reversed: " + b.reverseBits(n));
    }
}
