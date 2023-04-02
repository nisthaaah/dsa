import java.util.*;
class BinarySearch {
    int binarySearch(int arr[], int x, int low, int high){
        if(low <= high){
        int mid= (low+high)/2;
            if(arr[mid]==x){
                return mid+1;
            }
            else if(x > arr[mid]){
                return binarySearch(arr,mid+1,high,x);
        }
            else{
                return binarySearch(arr,low,mid-1,x);
        }
    }
        return -1;
}
       
        public static void main(String[] args){
            BinarySearch bs=new BinarySearch();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the elements: ");
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Enter the target: ");
            int x=sc.nextInt();
            int result=bs.binarySearch(arr,x,0,size-1);
            if(result==-1){
                System.out.println("not found");
            }
                else{
                    System.out.println("found at: " +result);
                }
        }
    }