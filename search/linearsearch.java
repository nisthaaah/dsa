import java.util.Scanner;

public class linearsearch {
    public int lSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int target = 4;
        System.out.println("The element is: " +new linearsearch().lSearch(arr, target));
    } 
}