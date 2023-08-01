import java.util.Arrays;

public class removeDuplicates {
    public static int rDuplicates(int[] arr){
        if(arr.length==0) return 0;
        int currSize=1;;
         for(int i=1; i<arr.length; i++){
             if(arr[i] != arr[i-1]){
                 arr[currSize]= arr[i];
                 currSize++;
             }
         }
             return currSize;
         }

         public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength1 = rDuplicates(arr);
        System.out.println("New length: " + newLength1);
        System.out.println("Unique values in list: " + Arrays.toString(Arrays.copyOfRange(arr, 0, newLength1)));
}
}
