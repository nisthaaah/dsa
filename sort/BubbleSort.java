import java.util.Arrays;

public class bubbleSort {
    public static void bubbleSort(int array[]) {
      int size = array.length;
      for (int i = 0; i < size - 1; i++)
        for (int j = 0; j < size - i - 1; j++)
          if (array[j] > array[j + 1]) {
             // swap
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
    }
  
    // void printArray(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    public static void main(String args[]) {
        
      int arr[] = {5, 4, 3, 2, 1 };
      bubbleSort(arr);
      System.out.println("Sorted Array in Ascending Order:" +Arrays.toString(arr));

      
    }
  }
