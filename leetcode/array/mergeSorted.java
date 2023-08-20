package leetcode.Array;

public class mergeSorted {
    public static void mergeSorted(int[] arr1, int m, int[] arr2, int n){
        int i = m-1; //Pointer for nums1 : 2
        int j = n-1; //Pointer for nums2 :2
        int k = m + n - 1; //Pointer for merged array : 5

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args){
        mergeSorted ms = new mergeSorted();
        int[] arr1 = new int[6]; // 1 1 3 0 0 0
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        int m =3;

        int[] arr2 = {2,6,7};
        int n = 3;

        ms.mergeSorted(arr1, m, arr2, n);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
    
}
