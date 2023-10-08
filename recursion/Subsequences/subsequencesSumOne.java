package recursion.Subsequences;
import java.util.ArrayList;

public class subsequencesSumOne { //to print only one sub sequence of sum K
    public static boolean subsequences(int[] arr, int i, ArrayList<Integer> subseq, int sum, int s){
        if(i == arr.length){
            if(sum == s){
                System.out.println(subseq);
                return true;
            }
            return false;
        }

        subseq.add(arr[i]);
        s += arr[i];
        if(subsequences(arr, i + 1, subseq, sum, s) ==  true) return true;

        subseq.remove(subseq.size() - 1);
        s -= arr[i];
        if(subsequences(arr, i + 1, subseq, sum, s) == true) return true;

        else return false;


    }

    public static void main(String[] args) {
        ArrayList<Integer> subseq = new ArrayList<>();
        int[] arr = {1, 2, 1};
        subsequences(arr, 0, subseq, 2, 0);
    }
}