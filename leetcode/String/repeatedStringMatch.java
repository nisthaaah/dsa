package leetcode.String;

public class repeatedStringMatch {
    public int repeatedStringMatch(String a, String b){
        String newA = a;
        int repeat = b.length() / a.length();
        int count = 1;
        for(int i = 0; i < repeat + 2; i++){
            if(a.contains(b)){
                return count;
            }
            else{
                a += newA;
                count++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a  = "cc";
        String b = "c";
        System.out.println("The minimum number of times you should repeat string a so that string b is a substring of it: " +new repeatedStringMatch().repeatedStringMatch(a, b));
    }
}