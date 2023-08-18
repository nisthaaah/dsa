package strings;

public class firstOccurence {
    public static int strStr(String s1, String s2){
        for(int i=0; i<s1.length() - s2.length() +1; i++){
            if(s1.charAt(i) == s2.charAt(0)){
                if(s1.substring(i, i + s2.length()).equals(s2)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(strStr("sadbutsad", "sad"));
    }
    
}