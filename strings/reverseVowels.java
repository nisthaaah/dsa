package strings;
import java.util.*;

public class reverseVowels {
    public String reverseVowels(String s){
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] characters = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(vowels.contains(characters[left])){
                if(vowels.contains(characters[right])){
                    char temp = characters[left];
                    characters[left] = characters[right];
                    characters[right] = temp;
                    left++;
                    right--;
                }
                else{
                    right--;
                }
            }
            else{
                    left++;
                }
        }
        return new String(characters);
    }

    public static void main(String[] args){
        String s = "Hello";
        System.out.println("The string with reversed vowels is: " +new reverseVowels().reverseVowels(s));
    }
}