package recursion;

public class towerOfHanoi {
    public static void toi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk " +n+ " from " +src+ " to " +dest);
            return;
        }

        toi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " +n+ " from " +src+ " to " +dest);
        toi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        toi(n, "S", "H", "D");
    }
}
