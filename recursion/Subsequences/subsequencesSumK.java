package recursion.Subsequences;
import java.util.ArrayList;

public class subsequencesSumK {
    public static void subsequences(int[] arr, int i, ArrayList<Integer> subseq, int sum, int s){
        if(i == arr.length){
            if(sum == s){
                System.out.println(subseq);
            }
            return;
        }

        subseq.add(arr[i]);
        s += arr[i];
        subsequences(arr, i + 1, subseq, sum, s);

        subseq.remove(subseq.size() - 1);
        s -= arr[i];
        subsequences(arr, i + 1, subseq, sum, s);
    }

    public static void main(String[] args) {
        ArrayList<Integer> subseq = new ArrayList<>();
        int[] arr = {1, 2, 1};
        subsequences(arr, 0, subseq, 2, 0);
    }
}