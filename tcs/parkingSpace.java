package tcs;
import java.util.*;

public class parkingSpace {
   
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int col=sc.nextInt();
        
        System.out.println("Enter the values: ");
        int arr[][]=new int[row][col];
        for(int i=0;i< row;i++)
            for(int j=0;j< col;j++)
                arr[i][j]=sc.nextInt();
        
              int max=0,count=0,index=0;
              for(int i=0;i< row;i++)
                { 
                    count=0;
                    for(int j=0;j< col;j++)
                    {
                        if(arr[i][j]==1)
                        count++;
                    }
                        if(count>max)
                    {
                        max=count;
                        index=i+1;
                    }
                 }
        System.out.println(index);
    }
}
