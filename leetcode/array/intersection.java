package leetcode.Array;
import java.util.*;

public class intersection {
    public int[] intersection(int[] arr1, int[] arr2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int n : arr1){
            s1.add(n);
        }

        for(int n : arr2){
            if(s1.contains(n)){
                s2.add(n);
            }
        }

        int[] res = new int[s2.size()];
        int i = 0;
        for(int n : s2){
            res[i] = n;
            i++;
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        int intersection[] = new intersection().intersection(arr1, arr2);
        for(int n : intersection){
            System.out.println(n);
        }
    }
}