package leetcode.String;

public class lastWord {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int length = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else break;
        }
        return length;
    }
    public static void main(String[] args){
        String s = "Hello worldd ";
        System.out.println("Length of the Last Word: "+lastWord.lengthOfLastWord(s));
    }
}
