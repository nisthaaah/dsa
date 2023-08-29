package leetcode.Random;

public class minpenalty {
    public int bestClosingTime(String customers){ 
        int penalty = 0;
        int maxPenalty = 0;
        int bestHour = -1;

        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y') penalty++; //penalty += (customers.charAt(i) == 'Y') ? 1 : -1;
            else penalty--;
            if(penalty > maxPenalty){
                maxPenalty = penalty;
                bestHour = i;
            }
        }
        return bestHour + 1;
    }
    public static void main(String[] args){
        String customers = "NNNN";
        System.out.println("The best closing time is: " +new minpenalty().bestClosingTime(customers) +"h");
    }
}