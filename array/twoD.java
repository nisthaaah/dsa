import java.util.*;
class twoD{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();


        int numbers[][]= new int[r][c];

        //input
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
            numbers[i][j]=sc.nextInt();
            }
    }
        //output
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
        System.out.print(numbers[i][j] + " ");
        }
        System.out.println();
}
}
}