package recursion.Subsequences;
import java.util.HashSet;
import java.util.Set;

public class subsequencesUnique {
    public static void subsequencesUnique(String s, int i, String newStr, Set<String> set){
        if(i == s.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.print(newStr + " ");
                set.add(newStr);
                return;
            }
        }

        char curr = s.charAt(i);
        //to be
        subsequencesUnique(s, i + 1, newStr + curr, set);

        //not to be
        subsequencesUnique(s, i + 1, newStr, set);
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String s = "122";
        subsequencesUnique(s, 0, "", set);
    }
}
