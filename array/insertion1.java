import java.util.*;

public class insertion1 {
    public static int[] inserte(int n,int arr[],int e, int pos) {
        int newarr[]=new int[n+1];
        for(int i=0; i<n+1; i++){
            if(i < pos-1)
                newarr[i]=arr[i];
            else if(i==pos-1)
                newarr[i]=e;
            else
                newarr[i]=arr[i-1];
        }        
        return newarr;
    }
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("initial arrray:\n" + Arrays.toString(arr));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the position where you want to insert the element: ");
        int pos=sc.nextInt();
        System.out.println("Enter the element to be inserted: ");
        int e=sc.nextInt();
        arr=inserte(n, arr, e, pos);
        System.out.println("\narrray with"  + e +"inserted at position" + pos + ":\n" + Arrays.toString(arr));
    }
}
