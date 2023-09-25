import java.util.*;
class BinarySearch {
    int binarySearch(int arr[], int x, int low, int high){
        if(low <= high){
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
            int[] arr = {1,0,1,1,1};

            System.out.println("The element is " +new BinarySearch().binarySearch(arr, 0, 0, 4));
        }
    }