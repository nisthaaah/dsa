import java.util.*;

public class relativeRanking {
    public String[] findRelativeRanks(int[] score){
        int n = score.length; //5
        String[] res = new String[n];
        if (n <= 3) { //handles the case where the number of athletes are <= 3
            if (n == 1) {
                res[0] = "Gold Medal"; 
            } else if (n == 2) {
                res[0] = "Gold Medal"; 
                res[1] = "Silver Medal"; 
            } else { // n == 3
                res[0] = "Gold Medal"; 
                res[1] = "Silver Medal";
                res[2] = "Bronze Medal"; 
            }
            return res;
        }
        
        int[] sortedScores = Arrays.copyOf(score, n);
        Arrays.sort(sortedScores); //1, 2, 3, 4, 5

        Map<Integer, String> medal = new HashMap<>();
        medal.put(sortedScores[n - 1], "Gold medal"); //5 -> Gold
        medal.put(sortedScores[n - 2], "Silver medal"); //4 -> Silver
        medal.put(sortedScores[n - 3], "Bronze medal"); //3 -> Bronze
        for(int i = 0; i < n -3; i++){ //0, 1
            medal.put(sortedScores[i], Integer.toString(n - i)); //1 -> "5" || 2 -> "4"
        }

        for(int i = 0; i < n; i++){
            res[i] = medal.get(score[i]); //score[0] -> 5 -> Gold
        }
        return res;
    }

    public static void main(String[] args){
        int[] score = {1};
        String[] res = new relativeRanking().findRelativeRanks(score);

        for(String word : res){
            System.out.println(word);
        }
    }
}