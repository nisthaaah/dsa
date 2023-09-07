package leetcode.Array;
import java.util.*;

public class intersection2 {
    public int[] intersection2(int[] arr1, int[] arr2){
        Arrays.sort(arr1); //1,1,2,2
        Arrays.sort(arr2); //2,2

        List<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) i++; //i=1, i=2
            else if(arr1[i] > arr2[j]) j++;
            else{
                arr.add(arr1[i]); //arr = [2, 2]
                i++; //i=3
                j++; //j=1
            }
        }
        int[] res = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            res[k] = arr.get(k); 
            k++;
        }
        return res; //[2,2]
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        int[] intersection = new intersection2().intersection2(arr1, arr2);
        for(int n : intersection){
            System.out.println(n);
        }
    }
}
