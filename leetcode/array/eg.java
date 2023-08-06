import java.util.*;;
class eg {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int arr[] = new int[size];
      
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("the indices: " +arr[i]  + "," + arr[j]);
                }
            }
        }    
    }
}