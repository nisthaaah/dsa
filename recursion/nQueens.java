package recursion;
import java.util.ArrayList;
import java.util.List;

public class nQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backTrack(board, res, 0);
        return res;
    }

    public static void backTrack(char[][] board, List<List<String>> res, int col) {
        if (col == board.length) {
            res.add(print(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                backTrack(board, res, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //upper right
        r = row;
        for(int c = col; r >= 0 && c < board.length; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for(int c = col; r < board.length && c >= 0; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        r = row;
        for(int c = col; r < board.length && c < board.length; r++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static List<String> print(char[][] board) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            newBoard.add(new String(board[i]));
        }
        return newBoard;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}
