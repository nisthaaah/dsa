package recursion.Combination;
import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public List<List<Integer>> combination3(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        backTrack(n, k, res, new ArrayList<>(), 1);
        return res;
    }

    public void backTrack(int n, int k, List<List<Integer>> res, ArrayList<Integer> curr, int start){
        if(n < 0) return;
        else if(n == 0 && curr.size() == k) res.add(new ArrayList<>(curr));
        else{
        for(int i = start; i <= 9; i++){
            curr.add(i);
            backTrack(n - i, k, res, curr, i + 1); //(7 - 1) -> 6, (6 - 2) -> 4, (4 - 4) -> 0
            curr.remove(curr.size() - 1);
        }
    }
}

public static void main(String[] args) {
    int n = 9; //sum
    int k = 3;
    System.out.println("The combination sum for " +n+ " is " +new combinationSum3().combination3(n, k));
    }
}