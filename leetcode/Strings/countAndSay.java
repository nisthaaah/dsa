package leetcode.Strings;

public class countAndSay {
    public String countAndSay(int n){
        if(n == 1) return "1";
        String res = "1";
        for(int i = 2; i <= n; i++){
            res = generateNextTerm(res);
        }
        return res;
    }
    public String generateNextTerm(String s){
        StringBuilder sb = new StringBuilder();
        char currChar = s.charAt(0); //1
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(currChar == s.charAt(i)){
                count++; //2
            }
            else{
                sb.append(count).append(currChar); //2 1
                currChar = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(currChar);//2 1
        return sb.toString();
    }

    public static void main(String[] args){
        int n = 4;
        System.out.println("The count and say for " +n+ " is: " +new countAndSay().countAndSay(n));
    }
}