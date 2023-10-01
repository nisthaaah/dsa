package leetcode.String;

public class runLength {
    public String runLen(String s){
        if(s == null || s.isEmpty()) return " ";

        StringBuilder res = new StringBuilder();
        int count = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++; //2
            }
            else{
                res.append(s.charAt(i - 1)); //a
                res.append(count); //a2b2c1
                count = 1;
            }
        }
            res.append(s.charAt(s.length() - 1)); //d
            res.append(count); //d1

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "aabbcd";
        System.out.println("The result is " +new runLength().runLen(s));
    }
}