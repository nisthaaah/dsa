package leetcode.Heap;

public class findKthSmallest {
   public static int smallestElement(int[] arr, int k){
    Heap maxHeap = new Heap();
    for(int num : arr){
        maxHeap.insert(num);
        if(maxHeap.getHeap().size() > k){
            maxHeap.remove();
        }
    }
    return maxHeap.remove();
   }  
   
public static void main(String[] args){
    int[] arr = {7, 10, 4, 3, 20, 15};
    int k= 3;
    System.out.println("The Kth smallest element: " +smallestElement(arr, k));
  }
}
