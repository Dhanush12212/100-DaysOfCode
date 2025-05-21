//Rotate the matrix by 90 degree

//Brute force approach
// public class Array19 {
//     public static int[][] rotateArray(int arr[][]) {
//         int n = arr.length;
//         int rotated[][] = new int[n][n];
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 rotated[j][n-i-1] = arr[i][j];
//             }
//         }
//         return rotated;
//     }
    
//     public static void main(String args[]) {
//         int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//         int rotated[][] = rotateArray(arr);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < rotated.length; i++) {
//             for (int j = 0; j < rotated.length; j++) {
//                 System.out.print(rotated[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }


//Optimal Solution
public class Array19 {
    public static int[][] rotateArray(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1] = temp;
            }
        }
        return arr;
    }
    
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rotated[][] = rotateArray(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }
}