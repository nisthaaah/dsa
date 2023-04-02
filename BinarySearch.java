import java.util.*;;
class BinarySearch {
    int binarySearch(int arr[], int x, int low, int high, int mid){
        if(low <= high){
            mid= (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(x>arr[mid]){
                low=mid+1;
        }
            else{
                high=mid-1;

        }
       
        public static void main(String[] args){
            BinarySearch bs=new BinarySearch();
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int arr[]=new int[size];
            int x=sc.nextInt();
            int result=bs.BinarySearch(arr,0,size-1,x);
            if(result==-1){
                System.out.println("not found");
            }
                else{
                    System.out.println("found" +result);
                }
        }
    }
}