package leetcode.Array;

public class commonItem {
    public static boolean commonItem(int[] arr1, int[] arr2){
        for(int i: arr1){
            for(int j: arr2){
                if(i == j) return true;
            }
        }
    return false;
    
}
public static void main(String[] args){
    int[] arr1= {1,2,3,4};
    int[] arr2={7,6,5,1};

    System.out.println(commonItem(arr1, arr2));
}
} //O(n^2)
