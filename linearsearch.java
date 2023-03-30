import java.util.*;

public class linearsearch {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of rows and columns: ");
    int r=sc.nextInt();
    int c=sc.nextInt();

    int[][] numbers = new int[r][c];
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            System.out.println("Enter the elements: ");
            numbers[i][j]=sc.nextInt();

        }}
        System.out.println("Enter the number to be searched: ");
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
