import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num = 1;
            int prev = 0;

            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");

                int sum = prev + num;
                prev = num;
                num = sum;
            }
            System.out.println();
        }
    }
}