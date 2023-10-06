package recursion;

public class stringReverse {
    public static void reverse(int i, String s){
        if(i < 0){
            return;
        }
        System.out.print(s.charAt(i) + " ");
        reverse(i - 1, s);
    }

    public static void main(String[] args) {
        String s = "abcd";
        reverse(s.length() - 1, s);
    }
}
