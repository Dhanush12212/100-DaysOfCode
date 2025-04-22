public class nQueen {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static int countWays = 0;

    public static void placeQueen(char board[][], int row) {
        if(row == board.length) {
            printQueens(board);
            countWays++;
            return;
        }
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {   
                board[row][j] = 'Q';        //place
                placeQueen(board, row+1);   //recurse
                board[row][j] = 'x';        //backtrack
            }
        }
    }
    public static void printQueens(char board[][]) { 
        System.out.println("-----------Chess Board-----------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                board[i][j] = 'x';
            }
        }
        placeQueen(board, 0);
        System.out.println("Total Number of Solution is: "+countWays);
    }
}
