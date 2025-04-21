public class DiagonalSum {
    public static int printSum(int matrix[][]) { 
        int sum = 0;
        //Brute-Force Approach
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {

        //         //Primary diagonal
        //         if( i == j ) {
        //             sum += matrix[i][j];
        //         }
        //         //Secondary diagonal
        //         else if( i + j == matrix.length-1 ) {
        //             sum += matrix[i][j];
        //         } 

        //     }
        // }

        //Linear approach
        for(int i=0; i<matrix.length; i++) {
            //Primary diagonal
            sum += matrix[i][i];

            //Secondary diagonal
            //run only when i not equal to j to avoid the diagonal element repetation
            if( i!= matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        
        return sum;
    }
    public static void main(String[] args) { 
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {26,36,46,56},
                         {27,37,47,57}};
        System.out.println("The Sum of the diagonals of the matrix is: "+printSum(matrix));
    }
}