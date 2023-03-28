import java.util.*;
public class eg10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        //input
        for(int i=0; i<size; i++){
            number[i]=sc.nextInt();
        }

        for(int i=0; i<size; i++){
            if(number[i] > number[i+1]){
                System.out.println("not sorted");
            }
            else{
                System.out.println("sorted");
            }
        }



    }

    
}
