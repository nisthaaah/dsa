package recursion.Subsequences;

public class subsequencesCount {
    public static int subsequences(int[] arr, int i, int sum, int s){
        if(i == arr.length){
            if(sum == s){
                return 1;
            }
            else return 0;
        }

        s += arr[i];
        int sum1 = subsequences(arr, i + 1, sum, s);

        s -= arr[i];
        int sum2 = subsequences(arr, i + 1, sum, s);

        return sum1 + sum2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println("The count of the number of subsequences is " +subsequences(arr, 0, 2, 0));
    }
}
