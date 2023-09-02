package leetcode.Random;

public class intToRoman {
    public String roman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        int i =0;
        while(num > 0){
            if(num >= values[i]){
                sb.append(roman[i]);
                num -= values[i];
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        int num = 1999;
        System.out.println("The Roman Numeral for " +num+ "is: " +new intToRoman().roman(num));
    } 
}