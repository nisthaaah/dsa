import java.util.*;
public class hollow_butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        //upper half

        //1st part
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || i==n || j==n || i==j )
                {
                System.out.print("*");
            }
             else{
                System.out.print(" ");
             }
        }

        //spaces
        int spaces=2 * (n-i);
        for(int j=1; j<=spaces; j++){
        System.out.print(" ");
     }
     
        //3rd part
        for(int j=1; j<=i; j++){
          if(i==1 || j==1 || i==n || j==n || i==j ){
         System.out.print("*");
         }
          else{
            System.out.print(" ");
         }
     }
         System.out.println();
 }


        //lower half
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || i==n || j==n || i==j )
                {
                System.out.print("*");
            }
             else{
                System.out.print(" ");
             }
        }
        int spaces=2 * (n-i);
        for(int j=1; j<=spaces; j++){
        System.out.print(" ");
     }

     for(int j=1; j<=i; j++){
        if(i==1 || j==1 || i==n || j==n || i==j ){
         System.out.print("*");
     }
     else{
            System.out.print(" ");
         }
     }
         System.out.println();
 }
    }
}