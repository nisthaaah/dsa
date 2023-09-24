package leetcode.Array;

public class countInversions {
    public static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low; //left = 0
        int right = mid + 1; //right = 3
        //[1, 3, 4] || [0, 2, 6]
        int count = 0;
        int k = low;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[k] = arr[left];
                k++;
                left++;
            } 
            else {
                temp[k] = arr[right];
                k++;
                count += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
        }
        while (right <= high) {
            temp[k] = arr[right];
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
        return count;
    }

    public static int countInversions(int[] arr, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = (low + high) / 2; //(0 + 5) / 2 => 2, 1, 0
        int leftInversions = countInversions(arr, low, mid); //(arr, 0, 2), (arr, 0, 1), (arr, 0 , 0) || [1,3,4]
        int rightInversions = countInversions(arr, mid + 1, high); //(arr, 3, 5) || [0,2,6]
        int mergeInversions = merge(arr, low, mid, high);

        return leftInversions + rightInversions + mergeInversions; //1 + 2 + 5 => 8
    }

    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 2, 6, 0};

        int inversions = countInversions(originalArray, 0, originalArray.length - 1); //(0, 5)

        System.out.println("Number of inversions: " + inversions);
    }
}