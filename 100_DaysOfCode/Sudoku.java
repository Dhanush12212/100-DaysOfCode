public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //Row
        for(int i=0; i<=8; i++) {
            if(sudoku[i][col] == digit) 
                return false;
        }
        
        //Col
        for(int j=0; j<=8; j++) {
            if(sudoku[row][j] == digit) 
                return false;
        }

        //Grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //3x3 grid
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(sudoku[i][j] == digit) 
                    return false;
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        //base case  
        if(row == 9 && col == 0) {
            return true;
        }  

        int nextRow = row, nextCol = col+1;

        if(col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }

        //Checking if it already had a number
        if(sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        //Placing the digits
        for(int digit=1; digit<=9; digit++) {
            if(isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;

                if(sudokuSolver(sudoku, row, col)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        } 
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for(int i=0; i<=8; i++) {
            for(int j=0; j<=8; j++) {
                System.out.print(sudoku[i][j]+ " ");
            }
            System.out.println();
        } 
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 4, 5, 0, 0, 6, 0, 8 ,0},
            {0, 7, 6, 0, 0, 5, 2, 4, 3},
            {9, 0, 3, 4, 7, 8, 5, 0, 6},
            {2, 1, 0, 6, 8, 7, 3, 0, 0},
            {0, 8, 7, 5, 2, 4, 9, 6, 0},
            {6, 0, 4, 0, 1, 0, 8, 0, 7},
            {7, 6, 8, 9, 0, 2, 1, 3, 5},
            {4, 0, 2, 7, 0, 1, 0, 9, 8},
            {5, 9, 1, 0, 6, 0, 4, 0, 2},
        };

        if(sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists: ");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exists");
            return;
        }
    }
}
