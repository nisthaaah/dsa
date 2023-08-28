class subRectangleQueries{
    int[][] result;

    subRectangleQueries(int[][] rectangle){
        result = rectangle;
    }

    public void update(int row1, int col1, int row2, int col2, int value){ //(0, 0, 3, 2, 8)
        for(int i = row1; i <= row2; i++){ 
            for(int j = col1; j <= col2; j++){
                result[i][j] = value;
            }
        }
    }

    public int getValue(int row, int col){
        int val = result[row][col];
        return val;
    }

    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 1},
            {4, 3, 4},
            {3, 2, 1},
            {1, 1, 1}
        };

        subRectangleQueries s = new subRectangleQueries(matrix);

        System.out.println("Initial Matrix: ");
        printMatrix(matrix);

        s.update(0, 0, 3, 2, 8);
        int[][] updatedMatrix = s.result;

        System.out.println("\nUpdated Matrix:");
        printMatrix(updatedMatrix);

        System.out.println("\nThe value: " +s.getValue(1, 1));    
    }

    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}