package recursion;

public class placeTiles {
    public static int tiles(int n, int m){
        if(n == m) return 2;
        if(n < m) return 1;

        int verticallyPlaced = tiles(n - m, m);
        int horizontallyPlaced = tiles(n - 1, m);

        return verticallyPlaced + horizontallyPlaced; //
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println("\nThe number of ways in which tiles of size 1 X " +m+ " can be placed on a floor of size " +n+ " X " +m+ " : ");
        System.out.println(tiles(n, m));
    }
}
