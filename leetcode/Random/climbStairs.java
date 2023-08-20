package leetcode.Random;

public class climbStairs {
    public static int climbStairs(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for(int i = 2; i<=n ; i++){
            int temp=curr; //temp = 1 || 2 || 3 || 4 
            curr +=prev; //curr = 2 || 3 || 5 || 8
            prev=temp; //prev = 1 || 2 || 3 || 4
        }
        return curr; //8
        //return climbStairs(n-1) + climbStairs(n-2); //climbStairs(4) + climbStairs(3) => 1+1 => 2
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Number of ways for " +n+ " stairs: " + climbStairs(n));
    }
}
