package leetcode.Array;

public class teemoAttack {
    public int teemoAttack(int[] timeSeries, int duration){
        if(timeSeries.length == 0) return 0;
        int res = duration;

        for(int i = 1; i < timeSeries.length; i++){
            res+= Math.min(duration, timeSeries[i] - timeSeries[i - 1]); //res = 2 + min(2, 1) => 3
        }
        return res;
    }

    public static void main(String[] args){
        int[] timeSeries = {1,2};
        int duration = 2;

        System.out.println("The total number of seconds that Ashe is poisoned is: " +new teemoAttack().teemoAttack(timeSeries, duration));
    } 
}