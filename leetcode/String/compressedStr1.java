package leetcode.String;

public class compressedStr1 {
    public int compression1(char[] chars){
        int i = 0;
        int j = 0;
        while(j < chars.length){
            char churrChar = chars[j];
            int count = 0;

            while(j < chars.length && chars[j] == churrChar){
                count++;
                j++;
            }
            chars[i] = churrChar;
            i++;

            if(count > 1){
                String countStr = String.valueOf(count);
                for(char c : countStr.toCharArray()){
                    chars[i] = c;
                    i++;
                }
            }
        }
        return i;
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