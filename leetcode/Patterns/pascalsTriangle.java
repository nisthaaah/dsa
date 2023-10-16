package leetcode.Patterns;
import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public List<List<Integer>> pascT(int numRows){
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList();
        for(int i = 0; i < numRows; i++){ // 0 < 4
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++ ){ //0 <= 4
                if(j == 0 || j == i){                                                    //  1
                    row.add(1);                                                       // 1   1
                }                                                                      // 1  2  1 [1st row(2nd element) + 1st row(1st element)]
                else{                                                                 // 1  3  3  1
                    row.add(result.get(i-1).get(j) + result.get(i-1).get(j-1)); //result.get(1).get(1) + result.get(1).get(0) => 1 + 1 -> 2
                }
            }
            result.add(row);
        }
        return result;
    } //O(n^2)

    public static void main(String[] args){
        pascalsTriangle p = new pascalsTriangle();
        int numRows = 4;

        System.out.println("The pascal's triangle is:\n" +p.pascT(numRows));
    }
}
