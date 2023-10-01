package leetcode.String;

public class reverseWord {
    public String reverse(String s){
        String[] words = s.split(" ");

        StringBuilder res = new StringBuilder();

        for(String word : words){
            String reversedWord = reversed(word); 
            res.append(reversedWord).append(" ");
        }
        return res.toString().trim();
    }

    public static String reversed(String word){
        char[] wordsChar = word.toCharArray(); //God
        int left = 0; //0
        int right = wordsChar.length - 1; //2

        while(left < right){
            char temp = wordsChar[left];
            wordsChar[left] = wordsChar[right];
            wordsChar[right] = temp;
            left++;
            right--;
        }
        return new String(wordsChar);
    }

    public static void main(String[] args) {
        String s = "jkjk hhhd";
        System.out.println("The reversed String: " +new reverseWord().reverse(s));
    }  
}