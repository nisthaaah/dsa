import java.util.*;
public class oneD2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String names[] = new String[size];
      
        for(int i=0; i<size; i++){
            names[i]=sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println("name: 3" +names[i]);
        }

    }

}
