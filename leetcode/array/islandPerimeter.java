package leetcode.Array;

public class islandPerimeter {
    public int islandPerimeter(int[][] grid){
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){ //grid[0][1]
                    if(i == 0 || grid[i - 1][j] == 0) perimeter++; //left
                    if(i == row - 1 || grid[i + 1][j] == 0) perimeter++; //above
                    if (j == 0 || grid[i][j - 1] == 0) perimeter++; //right
                    if (j == col - 1 || grid[i][j + 1] == 0) perimeter++; //bottom
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args){
        int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        System.out.println("The Perimeter is: " +new islandPerimeter().islandPerimeter(grid));
    }
}