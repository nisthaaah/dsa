package recursion.Subsequences;

public class subsequences {
    public static void subsequences(String s, int i, String newStr){
        if(i == s.length()){
            System.out.print(newStr + " ");
            return;
        }

        char curr = s.charAt(i);
        //to be
        subsequences(s, i + 1, newStr + curr);

        //not to be
        subsequences(s, i + 1, newStr);
    }

    public static void main(String[] args) {
        String s = "abc";
        subsequences(s, 0, "");
    }
}
