package recursion;

public class keypad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeyPad(String s, int i, String combination){
        if(i == s.length()){
            System.out.print(combination + " ");
            return;
        }

        char curr = s.charAt(i);
        String mapping = keypad[curr - '0'];

        for(int j = 0; j < mapping.length(); j++){
            printKeyPad(s, i + 1, combination + mapping.charAt(j));
        }
    }

    public static void main(String[] args) {
        String s = "16";
        printKeyPad(s, 0, "");
    }
}