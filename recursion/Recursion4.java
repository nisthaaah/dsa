package recursion;

import java.util.Scanner;

public class Recursion4 {
    public static int factn(int n){
        if(n==0 || n==1){
            return 1;
        }
        int f = factn(n-1);
        int f1 = n * f;
        return f1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int ans=factn(n);
        System.out.println(ans);
    }
    
}