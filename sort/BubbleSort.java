import java.util.Scanner;
class BubbleSort{
    void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    void printArray(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        //input
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort bs = new BubbleSort();
        System.out.println("before sorting: ");
        bs.printArray(arr);
        bs.bubbleSort(arr); 
        System.out.println("after sorting: ");
        bs.printArray(arr);
    }
}