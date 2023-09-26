import java.util.*;
class BinarySearch {
    int binarySearch(int arr[], int x, int low, int high){
        while(low <= high){
        int mid = (low + high) / 2; //(0+4) / 2 => 2
            if(arr[mid] == x){
                return mid + 1; //3
            }
            else if(arr[mid] < x){
                low = mid + 1;
        }
            else{
                high = mid - 1;
        }
    }
    return -1;
}
       
        public static void main(String[] args){
            int[] arr = {0,2,3,4,5};

            System.out.println("The element is " +new BinarySearch().binarySearch(arr, 5, 0, 4));
        }
    }