package leetcode.String;

public class zigZagConversion {
    public String convert(String s, int numRows){
        if(s.length() == 1) return s; 

        StringBuilder str = new StringBuilder(); 
        int n = s.length(); //14
        int k = 2 * (numRows - 1); //k = 6 
        for(int i = 0; i < numRows; i++){
            int index = i; // index = 0 || index = 1
            while(index < n){ // 6 < 14 || 12 < 14
                str.append(s.charAt(index)); //<P I N A
                if(i != 0 && i != (numRows - 1)){ // 3
                    int k1 = k - (2*i); //k1 = 6 - 0 = 6, 4
                    int k2 = index + k1; //k2 = 12, 10
                    if(k2 < n){
                        str.append(s.charAt(k2)); // N
                    }
                }
                index = index + k; //index = 6, 12
            }
        }
        return str.toString();
    }

    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println("The zig zag conversion is: " +new zigZagConversion().convert(s, numRows));
    }
}