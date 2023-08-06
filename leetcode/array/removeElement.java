import java.util.Arrays;

public class removeElement {
    public static int removeElement(int[] arr, int val){
            int i=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] != val){ // If the current element is not equal to the given value...
                    arr[i] = arr[j]; // copy it to the position of the 'write' index i...
                    i++;
                        
                }
                // If the current element equals val, it is skipped
        }
        return i;
    } 
    public static void main(String [] args){
        int[] arr={1,1,1,1,1};
        int val=1;
        int newLength1 = removeElement(arr, val);
        //System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Modified array: " + Arrays.toString(arr) + "\nNew length: " +newLength1);
    }
    // public static void main(String[] args) {
    //     int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    //     int val1 = 1;
    //     int newLength1 = removeElement(nums1, val1);
    //     System.out.println("Test case 1: Modified array: " + Arrays.toString(nums1) + "\nNew length: " + newLength1);
    // }
}
