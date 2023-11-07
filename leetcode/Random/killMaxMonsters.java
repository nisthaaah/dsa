package leetcode.Random;
import java.util.Arrays;

public class killMaxMonsters {
    public int kill(int[] dist, int[] speed){
        int n = dist.length;
        double[] time = new double[n];

        for(int i = 0; i < n; i++){
            time[i] = (double)dist[i] / speed[i]; //[1,2,3]
        }

        Arrays.sort(time); //[1,2,3]

        for(int i = 0; i < n; i++){
            if(time[i] <= i){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] dist = {1,2,3};
        int[] speed = {1,1,1};

        System.out.println("The max number of monsters killed: " +new killMaxMonsters().kill(dist, speed));
    }
}