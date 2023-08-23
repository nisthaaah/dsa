package leetcode.Patterns;
import java.util.*;

public class pascalsTriangle {
    public List<List<Integer>> pascT(int numRows){
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList();
        for(int i= 1; i <= numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0; j < i; j++ ){
                if(j==0 || j == i-1){
                    row.add(1);
                }
                else{
                    row.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args){
        pascalsTriangle p = new pascalsTriangle();
        int numRows = 5;

        System.out.println("The pascal's triangle is:\n" +p.pascT(numRows));
    }
}
