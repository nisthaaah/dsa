package leetcode.Array;
import java.util.*;

public class assignCookies {
    public int assignCookies(int[] g, int[] s){
        Arrays.sort(g); //1,2,3 -> i
        Arrays.sort(s); //1,1 -> j
        int max = 0;

        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){ //s[0] >= g[0]
                max++; //1
                i++; //1
            }
            j++; //1
        }
        return max;
    }

    public static void main(String[] args){
        int[] g = {1,2,3,4};
        int[] s = {1,2};

        System.out.println("The maximum number of content children: " +new assignCookies().assignCookies(g, s));
    }
}