import java.util.Arrays;

public class eg5 {
    public static int[] deletee(int[] arr,int n, int index)
    {
      if(arr==null || index<0 ||index>= n)
      {
        return arr;
      }  
      int newarr[]=new int[n-1];
      for(int i=0, k=0; i<n; i++){
        if(i!=index){
            newarr[k]=arr[i];
            k++;
        }
      }
      return newarr;
    }
public static void main(String[] args) 
{
    int n=6;
    int[] arr={1,2,3,4,5,6};
    System.out.println("Before deletion:\n" +Arrays.toString(arr));
    int index=5;
    arr=deletee(arr,n, index); //remove the element
    System.out.println("After deletion:\n" +Arrays.toString(arr));    
}
}