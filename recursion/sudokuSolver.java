package recursion;

public class sudokuSolver {
    public void solveSudoku(char[][] board) {
        backTrack(board, 0, 0);
    }

    public boolean backTrack(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if(col == 8){
            nrow = row + 1;
            ncol = 0;
        }
        else{
            nrow = row;
            ncol = col + 1;
        }

        if(board[row][col] != '.'){
            return backTrack(board, nrow, ncol);
        }
        else{
            for(int i = 1; i <= 9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(backTrack(board, nrow, ncol)){
                    return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
            return false;
        }
    }


    public boolean isSafe(char[][] board, int row, int col, int num){
        //row & col
        for(int i = 0; i < 9; i++){
            if(board[i][col] == (char)(num + '0') || board[row][i] == (char)(num + '0')){
                return false;
            }
        }

        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);

        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(board[i][j] == (char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        sudokuSolver s = new sudokuSolver();

        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        s.solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}