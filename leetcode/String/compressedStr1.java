package leetcode.String;

public class compressedStr1 {
    public int compression1(char[] chars){
        int i = 0;
        int j = 0;
        while(j < chars.length){ //7
            char churrChar = chars[j]; //a, b, c
            int count = 0; //0

            while(j < chars.length && chars[j] == churrChar){
                count++; //count = 2
                j++; //2, 4
            }
            chars[i] = churrChar; //a
            i++; //1,3,5

            if(count > 1){
                String countStr = String.valueOf(count); //"2"
                for(char c : countStr.toCharArray()){
                    chars[i] = c; //'2', '2', '3'
                    i++; //2,4,6
                } //'a', '2', 'b', '2', 'c', '3'
            }
        }
        return i; //6
    }
    public static void main(String[] args) {
        compressedStr1 c = new compressedStr1();
        char[] chars = {'a' ,'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = c.compression1(chars);
        
        System.out.println("New length: " +newLength);
        System.out.print("Compressed String: " +"[");
        for(int k = 0; k < newLength; k++){
            System.out.print("'" + chars[k] + "'");
            if (k < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}