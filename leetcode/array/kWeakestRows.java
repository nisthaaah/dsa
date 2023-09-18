package leetcode.Array;

import java.util.Arrays;

public class kWeakestRows {
    public int[] kWeakest(int[][] mat, int k){
        int[] count = new int[mat.length]; //5
        int[] res = new int[k]; //3

        for(int i = 0; i < mat.length; i++){
            int soldiers = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1) soldiers++;
                else break;
            }
            count[i] = soldiers*1000 + i;
        }
        Arrays.sort(count);
        for(int i = 0; i < k; i++){
            res[i] = count[i] % 1000;
        }
        return res;  
    }

    public static void main(String[] args){
        int[][] mat = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k = 3;

        int[] res = new kWeakestRows().kWeakest(mat, k);

        System.out.println();
        for(int row : res){
            System.out.println(row);
        }
    }
}
