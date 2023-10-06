package recursion;

public class Sum {
    public static int sum(int n){
        if(n > 0){
            return n + sum(n - 1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
            System.out.println("The sum is: " +sum(5));
        }
//     public static void printsum(int i, int n, int sum){
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return;
           
//     }
//     sum += i;
//     printsum(i + 1, n, sum);
//     System.out.println(i);
// }
//     public static void main(String args[]){
//         printsum(1, 5, 0);
//     }    
}