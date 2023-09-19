package leetcode.Array;

import java.util.Arrays;

public class kWeakestRows {
    public int[] kWeakest(int[][] mat, int k){
        int[] count = new int[mat.length]; //5
        int[] res = new int[k]; //3

        for(int i = 0; i < mat.length; i++){
            int soldiers = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1) soldiers++; //row 0 => 2 || row 1 => 4 || row 2 => 1 || row 3 => 2 || row 4 => 5
                else break;
            }
            count[i] = soldiers*1000 + i; //2000, 4001, 1002, 2003, 5004
        }
        Arrays.sort(count); //1002, 2000, 2003, 4001, 5004
        for(int i = 0; i < k; i++){
            res[i] = count[i] % 1000; //[2, 0, 3] 
        }
        return res;  
    }

    public static void main(String[] args){
        int[][] mat = {
            {1,1,0,0,0}, //2
            {1,1,1,1,0}, //4
            {1,0,0,0,0}, //1
            {1,1,0,0,0}, //2
            {1,1,1,1,1} //5
        };
        int k = 3;

        int[] res = new kWeakestRows().kWeakest(mat, k);

        System.out.println("The " +k+ " weakest rows are: ");
        for(int row : res){
            System.out.println(row);
        }
    }
}