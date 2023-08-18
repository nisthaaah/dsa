package slidingWindow;

public class firstOccurence {
    public static int strStr(String s1, String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        int nIndex = 0;

        for(int i=0; i<length1; i++){
            if (s1.charAt(i) == s2.charAt(nIndex)){
                nIndex++;
            }
            else{
                i = i-nIndex;
                nIndex = 0;
            }
            if(nIndex == length2){
                return i - length2 + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(strStr("sadbutsad", "sad"));
    }
    
}
