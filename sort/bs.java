class bs {

    // perform the bubble sort
    void bubbleSort(int array[]) {
      int size = array.length;
      
      // loop to access each array element
      for (int i = 0; i < size - 1; i++)
      
        // loop to compare array elements
        for (int j = 0; j < size - i - 1; j++)
  
          // compare two adjacent elements
          // change > to < to sort in descending order
          if (array[j] > array[j + 1]) {
  
            // swapping occurs if elements
            // are not in the intended order
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
    }
  
    void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        
      int arr[] = {5, 4, 3, 2, 1 };
      
      // call method using class name
      bs ob=new bs();
      ob.bubbleSort(arr);
      System.out.println("Sorted Array in Ascending Order:");
      ob.printArray(arr);

      
    }
  }