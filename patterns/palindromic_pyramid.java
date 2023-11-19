import java.util.Scanner;
public class palindromic_pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){ //1 || 2 || 3
            for(int j=1; j<=n-i; j++){ //4-1 = 3 || 2 || 1
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){ //1 || 2, 1 || 3, 2, 1
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){ //  || 2 || 2, 3
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

