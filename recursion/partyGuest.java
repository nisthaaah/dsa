package recursion;

public class partyGuest {
    public static int guest(int n){
        if(n <= 1) return 1; 

        int single = guest(n - 1);
        int pairs = (n - 1) * guest(n - 2);

        return single + pairs;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("The number of ways to invite " +n+ " guests to the party is " +guest(n));
    }
}
