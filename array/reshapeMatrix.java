public class reshapeMatrix {
    public int[][] reshapeMatrix(int[][] mat, int r, int c){
        if((mat.length * mat[0].length) != (r * c)) return mat; //(3*4) = (2*6)

        int[][] res = new int[r][c];
        int res_r = 0;
        int res_c = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                res[res_r][res_c] = mat[i][j]; //1,2,3,4,5,6
                res_c++;                      //7,8,9,10,11,12

                if(res_c == c){ //6 
                    res_r++;
                    res_c = 0;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int r = 2;
        int c = 6;

        int[][] res = new reshapeMatrix().reshapeMatrix(mat, r, c);

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}