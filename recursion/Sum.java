package recursion;

public class Sum {
    public static int printsum(int n){
        if(n != 0){
            return n + printsum(n-1);
    }
    else return n;
}
    public static void main(String args[]){
        System.out.println("The sum is: " +printsum(4));

    }
    
}
