import java.util.*;
public class number2_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){

                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i==0 || j==i){
                    System.out.print("1");
                }
               else{
                int number=1;
                number= number * (i-j+1)/j;
                System.out.print(number);
               }
            }   
            System.out.println();
        }
    }
    
}

