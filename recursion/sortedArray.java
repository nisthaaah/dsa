package recursion;

public class sortedArray { //strictly increasing
    public static boolean sorted(int[] arr, int i){
        if(i == arr.length - 1){
            System.out.println("The array is sorted: ");
            return true;
        }

        if(arr[i] >= arr[i + 1]){
            System.out.println("The array is sorted: ");
            return false;
        }
        else{
            return sorted(arr, i + 1);
        }

        // if(arr[i] < arr[i + 1]){
        //     return sorted(arr, i + 1);
        // }
        // else{
        //     System.out.println("The array is sorted: ");
        //     return false;
        // }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sorted(arr, 0));
    }
}
