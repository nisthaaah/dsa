package leetcode.Patterns;

import java.util.ArrayList;
import java.util.List;

public class rowIndex {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        for (int j = 1; j < i; j++) {
            currRow.add(prevRow.get(j - 1) + prevRow.get(j));
        }

        currRow.add(1);
        prevRow = currRow;
    }

    return prevRow;
} // Space complexity [O(n)]

public static void main(String[] args){
    rowIndex r = new rowIndex();
    int rowIndex = 3;
    System.out.println("Row of " +rowIndex +" is: " +r.getRow(rowIndex));
   }
}
