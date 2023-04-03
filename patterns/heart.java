import java.util.*;
public class heart{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        for(int i=1; i<=2; i++){
            for(int j=1; j<=2-i; i++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i; k++){
                System.out.print("*");
            }
        for(int j=1; j<=2*(2-i+1)-1; j++){
            System.out.print(" ");
            }
            for(int k=1; k<=2*i; k++){
                System.out.print("*");
            }
            System.out.println();
}
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i+1)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}