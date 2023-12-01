package leetcode.String;

public class equivalentString {
    public boolean equivalent(String[] word1, String[] word2){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String s : word1){
            s1.append(s);
        }
        for(String s : word2){
            s2.append(s);
        }
        return (s1.toString().equals(s2.toString()));

        //return String.join("", word1).equals(String.join("", word2));
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "cd"};
        String[] word2 = {"a", "bcd"};

        System.out.println("The strings are equal: " +new equivalentString().equivalent(word1, word2));
    }
}