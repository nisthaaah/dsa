package recursion;

public class permutation {
    public static void printPerm(String s, String permutation){
        if(s.length() == 0){
            System.out.print(permutation + " ");
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i + 1);
            printPerm(newStr, permutation + curr);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        printPerm(s, "");
    }
}