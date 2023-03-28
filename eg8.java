import java.util.*;

public class eg8 {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();

    int[][] numbers = new int[r][c];
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            numbers[i][j]=sc.nextInt();

        }}

        int x=sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(x == numbers[i][j]){
                    System.out.println("x found at:" + i + "," + j + "");
                }
            }
        }
    }
   }
