package recursion;

public class calcPaths {
    public static int paths(int i, int j, int m, int n){
        if(i == m || j == n) return 0;
        if(i == m - 1 && j == n - 1) return 1;

        int downPaths = paths(i + 1, j, m, n);
        int rightPaths = paths(i, j + 1, m, n);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        System.out.println("The total number of paths is: ");
        System.out.println(paths(0, 0, 3, 3));
    }
}
