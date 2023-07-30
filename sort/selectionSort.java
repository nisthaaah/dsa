import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    


public static void main(String args[]) {
        
      int arr[] = {5, 4, 3, 2, 1 };
      selectionSort(arr);
      System.out.println("Sorted Array in Ascending Order:" +Arrays.toString(arr));
      
    }
}
