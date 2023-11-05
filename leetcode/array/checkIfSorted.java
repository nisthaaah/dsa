package leetcode.Array;

public class checkIfSorted {
    public boolean ifSorted(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                count++;
            }
        }
        if(count == 0) return true;
        else if(count > 1) return false;
        else if(arr[0] >= arr[arr.length - 1]) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println("The array is sorted: " +new checkIfSorted().ifSorted(arr));
    }
}