package recursion;

public class Print1 {
    public static void printn(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        printn(n+1);
    }
    public static void main(String args[]){
        int n=1;
        printn(n);
    }

    
}
