public class SpiralMatrix {
    public static void printSpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;


        // the equal symbol is for odd matrix
        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            
            //right col
            for (int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            
            //bottom row
            for (int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            
            //left col
            for (int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--; 
        }
        System.out.println();
    }
    public static void main(String[] args) { 
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {26,36,46,56},
                         {27,37,47,57}};
        printSpiralMatrix(matrix);
    }
}