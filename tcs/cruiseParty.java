package tcs;
import java.util.*;

public class cruiseParty{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Number of hours:");
    int t=sc.nextInt();

    int e[]=new int[t]; 
    int l[]=new int[t];
        for(int i=0;i<t;i++){
            System.out.println("Number of guests entering at each hour:");
            e[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            System.out.println("Number of guests leaving at each hour:");
            l[i]=sc.nextInt();
        }
        int max=0,sum=0; 
        for(int i=0;i<t;i++) {
            sum+=e[i]-l[i]; 
            max=Math.max(sum,max);
        } 
    System.out.println("Mamimum number of guests:");
    System.out.println(max);
    }
}
