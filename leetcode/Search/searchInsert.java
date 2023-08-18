package leetcode.Search;
class searchInsert {
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2; //reduces the risk of integer overflow
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else start = mid+1;
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr = {0,1,2,4};
        int target = 3;
        System.out.println("Index: " +searchInsert(arr, target));  
    }
}