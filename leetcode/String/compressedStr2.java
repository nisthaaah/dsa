package leetcode.String;

public class compressedStr2 {
    public String compression2(String s){
        StringBuilder compressedStr = new StringBuilder();
        for(int i = 0; i < s.length(); i+=2){
            char c = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i + 1));
            while(count > 0){
                compressedStr.append(c);
                count--;
            }
        }
        return compressedStr.toString();

    //     StringBuilder compressedStr = new StringBuilder();
    //     int i = 0;
    //     while (i < s.length()) {
    //         char c = s.charAt(i);
    //         i++;

    //         if (i < s.length()) {
    //             int count = Character.getNumericValue(s.charAt(i));
    //             while (count > 0) {
    //                 compressedStr.append(c);
    //                 count--;
    //             }
    //         }
    //         i++;
    //     }
    //     return compressedStr.toString();
    }

    public static void main(String[] args) {
        String s= "a3b2c3";
        String res = new compressedStr2().compression2(s);
        System.out.println("The new String: " +res);
    }
}
