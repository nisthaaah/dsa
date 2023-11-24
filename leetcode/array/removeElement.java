package leetcode.Array;

public class removeElement {
    public static int removeElement(int[] arr, int val){
            int i = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] != val){ // If the current element is not equal to the given value...
                    arr[i] = arr[j]; // copy it to the position of the 'write' index i...
                    i++;
                        
                }
                // If the current element equals val, it is skipped
        }
        return i;
    }
    public static void main(String [] args){
        int[] arr = {1,1,2};
        int val = 1;
        int newLength1 = removeElement(arr, val);

        System.out.println("\nModified array: " );
        for(int i = 0; i < newLength1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
