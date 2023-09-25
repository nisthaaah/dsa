import java.util.*;
class BinarySearch {
    int binarySearch(int arr[], int x, int low, int high){
        if(low <= high){
        int mid= (low+high)/2; //(0+4) / 2 => 2
            if(arr[mid] == x){
                return mid + 1; //3
            }
            else if(x > arr[mid]){
                return binarySearch(arr, mid+1, high, x);
        }
            else{
                return binarySearch(arr, low, mid-1, x);
        }
    }
    return -1;
}
       
        public static void main(String[] args){
            int[] arr = {1,2,3,4,5};

            System.out.println("The element is " +new BinarySearch().binarySearch(arr, 3, 0, 4));
        }
    }