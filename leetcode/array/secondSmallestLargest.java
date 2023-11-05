package leetcode.Array;

public class secondSmallestLargest {
    public int[] second(int n, int[] arr){
        if(arr.length < 2) return null;

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){//{1,2,3,4,5}
            //second smallest
            if(arr[i] < smallest){
                second_smallest = smallest;
                smallest = arr[i]; //1
            }
            else if(arr[i] < second_smallest && arr[i] != smallest){
                second_smallest = arr[i]; //2
            }

            //second largest
            if(arr[i] > largest){
                second_largest = largest; //MIN, 1, 2, 3, 4
                largest = arr[i]; //1, 2, 3, 4, 5
            }
            else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }

        return new int[] {second_largest, second_smallest};
    }
    // public int[] second(int n, int[] arr){
    //     if(arr.length < 2) return null;

    //     Arrays.sort(arr);

    //     int second_smallest = arr[1];
    //     int second_largest = arr[arr.length - 2];

    //     return new int[] {second_largest, second_smallest};
    // } //not optimal

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        int[] res = new secondSmallestLargest().second(n, arr);
        System.out.print("The Second Largest and Smallest number: " );
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}