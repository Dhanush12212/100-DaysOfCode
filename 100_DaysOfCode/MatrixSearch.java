public class MatrixSearch {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col>=0) {
            if(key == matrix[row][col]) {
                System.out.println("Key found at [" + row + ", " + col + "]");
                return true;
            }
            else if(key > matrix[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }
        System.out.println("Key not found!");
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {26,36,46,56},
                          {27,37,47,57}};
        int key = 37;
        staircaseSearch(matrix, key);
            
    }
}
