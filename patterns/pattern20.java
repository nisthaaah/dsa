import java.util.*;
public class pattern20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        //upper half
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++){
                if(i==1 || i==n){
                System.out.print("*");
                }
            
            else{
                System.out.print(" ");   
            }
            System.out.println();
        }
    }
}
}
