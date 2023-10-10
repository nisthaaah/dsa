package recursion.Subset;
import java.util.ArrayList;

public class findSubsets {
    public static void subset(int n, ArrayList<Integer> subset){
        if(n == 0){
            for(int i = 0; i < subset.size(); i++){
                System.out.print(subset.get(i) + " ");
            }
        System.out.println();
            return;
        }

        //include the current element
        subset.add(n);
        subset(n - 1, subset);

        //exclude the current element
        subset.remove(subset.size() - 1);
        subset(n - 1, subset);
    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        int n = 3;
        subset(n, subset);
    }
}
