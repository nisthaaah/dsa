import java.util.Arrays;

public class insertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp=arr[i];
            int j=i-1;
            while(j > -1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;

            }
        }

    }
    

    public static void main(String args[]) {
        
      int arr[] = {5, 4, 3, 2, 1 };
      insertionSort(arr);
      System.out.println("Sorted Array in Ascending Order:" +Arrays.toString(arr));

      
    }
}
