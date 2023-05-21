package recursion;

class Recursion1{
    public static void printn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printn(n-1);
    }
    public static void main(String args[]){
        int n=4;
        printn(n);
    }
}