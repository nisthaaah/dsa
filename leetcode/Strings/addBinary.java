package leetcode.Strings;

public class addBinary {
    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1; //111
        int j = b.length() - 1; //001

        while(i>=0 || j>=0 || carry==1){
            if(i>= 0){
                carry+= a.charAt(i--) - '0'; //carry = 0 + 1 - 0 => 1 || 1 + 1 - 0 => 2 || 1 + 1 - 0 => 2
            }
            if(j>= 0){
                carry+= b.charAt(j--) - '0'; //carry = 1 + 1 - 0 => 2 || 2 + 0 - 0 => 2 || 2 + 0 - 0 => 2
            }
                sb.append(carry % 2); //2%2 == 0 || 1%2 == 1
                carry /= 2; // carry = 2/2 => 1 || 1/2 == 0
            }
            return sb.reverse().toString(); //0001 => 1000
    }
    public static void main(String[] args){
        String a = "111";
        String b = "001";
        String result = addBinary(a, b);
        System.out.println("Input a: " + a);
        System.out.println("Input b: " + b);
        System.out.println("Sum: " + result);
    }
}
