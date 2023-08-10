package tcs;
import java.util.*;
public class vehicleProduction
{
    public static void main(String[] args)
    {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the total number of vehicles: ");
             int v=sc.nextInt();
             System.out.println("Enter the total number of wheels: ");
             int w=sc.nextInt();

             int result=((4*v)-w)/2; //calculate number of two wheelers
             if(w>=2 && (w%2==0) && v<w ) 
               System.out.println("Two Wheelers= "+ result +" Four Wheelers= "+ (v-result));
             else
                System.out.println("INVALID INPUT");
    }
}