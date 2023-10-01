package leetcode.String;

public class subSequence {
    public boolean isSequence(String s, String t){
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == s.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args){
        String s = "abc";
        String t = "adbhci";

        System.out.println("Is Sequence: " +new subSequence().isSequence(s, t));
    }
}
