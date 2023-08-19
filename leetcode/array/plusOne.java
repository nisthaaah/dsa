package leetcode.Array;

public class plusOne {
    public static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) { //1 9 9 => 1 9 0 => 1 0 0 => 2 0 0 
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } else {
                arr[i] = 0;
            }
        }
        
        // If we're here, it means all digits were 9, so we need to add an extra digit
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 9};
        int[] result = plusOne(arr);

        System.out.print("The array is: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
