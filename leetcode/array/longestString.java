public class longestString {
    public static String findLongestString(String[] stringList){
        if (stringList == null) {
            return null; 
        }
        String longestString = " ";
         for (String str : stringList) {
            if(str.length() > longestString.length()){
                longestString = str;
            }
        }
        return longestString;
    }
    public static void main(String[] args){
        String[] stringList={"aaa", "aaaaaaaa", "a", " "};
        String result = findLongestString(stringList);
        System.out.println("The longest string is " +result);
    }

    }
    

