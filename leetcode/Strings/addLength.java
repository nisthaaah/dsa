package leetcode.Strings;

public class addLength {
    public String addLen(String s){
        StringBuilder res = new StringBuilder();
        int count = 1;
        while(s == null || s.isEmpty()){
            for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }
            else{
                count = 1;
                res.append(s.charAt(i - 1));
                res.append(count);
            }
            res.append(s.charAt(s.length() - 1));
            res.append(count);
        }
    }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "aabbcd";
        System.out.println("The result is " +new addLength().addLen(s));
    }
}
