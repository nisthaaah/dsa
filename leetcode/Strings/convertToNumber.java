package leetcode.Strings;

public class convertToNumber {
    public int titleNumber(String columnTitle){
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            result *= 26;
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }
    public static void main(String[] args){
        String columnTitle = "AC";
        System.out.println("The corresponding title number: " +new convertToNumber().titleNumber(columnTitle));
    }
}