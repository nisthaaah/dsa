package leetcode.Strings;

public class convertToTitle {
    public String convertToString(int columnNumber){
    StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            result.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] main){
        convertToTitle c = new convertToTitle();
        int columnNumber = 345;
        System.out.println("The corresponding column title: " +c.convertToString(columnNumber));
    }  
}