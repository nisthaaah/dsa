package leetcode.String;

public class firstOccurence {
    public static int strStr(String s1, String s2){
        for(int i = 0; i <= s1.length() - s2.length(); i++){ //6-3 = 3 || i = 0, 1, 2,
            int j = 0;
            while(j < s2.length() && s1.charAt(i + j) == s2.charAt(j)){ //0 != 0 || 1 != 0 || 2 == 0 || 3 == 1
                j++; //1
                if(j == s2.length()){ //2
                    return i; //2
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(strStr("heello", "ll"));
    }
    
}