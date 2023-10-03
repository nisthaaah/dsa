package leetcode.String;

public class winner0fGame {
    public boolean winner(String colors){
        int alice = 0;
        int bob = 0;

        for(int j = 1; j < colors.length() - 1; j++){
            int i = j - 1;
            int k = j + 1;

            if(colors.charAt(i) == 'A' && colors.charAt(j) == 'A' && colors.charAt(k) == 'A'){
                alice++;
            }
            if(colors.charAt(i) == 'B' && colors.charAt(j) == 'B' && colors.charAt(k) == 'B'){
               bob++;
            }
        }
        return alice > bob;
    }

    public static void main(String[] args) {
        String colors = "AAABBB";
        System.out.println("The winner of the game is " +new winner0fGame().winner(colors));
    }
}