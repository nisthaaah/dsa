package tcs;
import java.util.*;

public class candiesJar {
     public static void main(String[] args) {
   	 int n = 10, k = 5;
   	 int num;
   	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of candies: ");
   	 num = sc.nextInt();
   	 if(num >= 1 && num <= 5) {
   		 System.out.println("Number of candies sold: " + num);
   		 System.out.print("Number of candies left: " + (n - num));
   	 } else {
   		 System.out.println("INVALID INPUT");
   		 System.out.print("Number of candies left: " + n);
   	 }
    }
}
