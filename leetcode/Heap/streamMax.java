package leetcode.Heap;
import java.util.*;

public class streamMax {
    public static List<Integer> streamMax(int[] arr){
    Heap maxHeap = new Heap();
    List<Integer> maxStream = new ArrayList<>();
    for(int num : arr){
        maxHeap.insert(num);
        maxStream.add(maxHeap.getHeap().get(0));
    }
    return maxStream;
    }

    public static void main(String[] args){
        int[] arr = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("The Maximum Stream is: " +streamMax(arr));
    } 
}