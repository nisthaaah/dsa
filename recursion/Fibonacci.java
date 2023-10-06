package recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n <= 1) return n;

        else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n  = 5;
        System.out.println("Fibonacci series: ");
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
    }
//     public static void fibn(int a, int b, int n){
//         if(n==0){
//             return;
//         }
//         int c= a+b;
//         System.out.println(c);
//         fibn(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the value of n: ");
//         int a= 0, b=1;
//         int n= sc.nextInt();
//         System.out.println("Fibonacci series: ");
//         System.out.println(a);
//         System.out.println(b);
//         fibn(a, b, n-2);
//    }
}