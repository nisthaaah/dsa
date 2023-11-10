package leetcode.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr); //[-4, -1, -1, 0, 1, 2]

        for(int i = 0; i < arr.length - 2; i++){ //1
            if(i > 0 && arr[i] == arr[i -1]) continue; //skip duplicates

            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum == 0){
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    while(j < k && arr[j] == arr[j+1]){
                        j++;
                    }
                    while(j < k && arr[k] == arr[k - 1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, -1, -1, 2, -4};

        List<List<Integer>> res = new threeSum().threeSum(arr);

        for(List<Integer> triplet : res){
            System.out.println(triplet);

        }
    }
}