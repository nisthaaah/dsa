package strings;

public class Strings {
    public static void main(String[] args){
        String name1 = "Nistha";
        String name2 = "Jimin";
        String sentence = "Nistha Sharma";
        System.out.println(sentence.substring(0, 2));

    //1 s1 > s2 : +ve value
    //2 s1 == s2 : 0
    //3 s1 < s2 : -ve value
    //always use compareTo() to compare two strings

    if(name1.compareTo(name2) == 0){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not Equal");
    } //Strings are Immutable
 }
    
}
