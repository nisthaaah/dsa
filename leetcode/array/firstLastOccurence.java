package leetcode.Array;

public class firstLastOccurence {
    public int[] findRange(int[] arr, int target){
        int[] res = new int[]{-1, -1};

        //first
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){ //1, 2, 2, 2, 3
            int mid = (left + right) / 2; //2 || 0 || 1
            if(arr[mid] == target){
                res[0] = mid; //2 || 1
                right = mid - 1; //right = 1
            }
            else if(arr[mid] < target){
                left = mid + 1;//left = 1
            }
            else{
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;
        while(left <= right){ //1, 2, 2, 2, 3
            int mid = (left + right) / 2; //2 || 3
            if(arr[mid] == target){
                res[1] = mid; //2 || 3
                left = mid + 1; //left = 3
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int target = 2;
        int[] res = new firstLastOccurence().findRange(arr, target);
        System.out.println("The first and last occurence of " +target+ ": " +"["  +res[0] + ", " + res[1] + "]");
    }
}