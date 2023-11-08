package leetcode.Random;
import java.util.Arrays;

public class killMaxMonsters {
    public int kill(int[] dist, int[] speed){
        int n = dist.length;
        double[] time = new double[n];

        for(int i = 0; i < n; i++){
            time[i] = (double)dist[i] / speed[i]; //[1,1,2,3] || [0.6,2,1]
        }

        Arrays.sort(time); //[1,1,2,3] || [0.6,1,2]

        for(int i = 0; i < n; i++){
            if(time[i] <= i){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] dist = {3,2,2}; //{3,6,2}
        int[] speed = {5,3,2}; //{5,3,2}

        System.out.println("The max number of monsters killed: " +new killMaxMonsters().kill(dist, speed));
    }
}