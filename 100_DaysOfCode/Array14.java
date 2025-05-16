// Sort of array based on 0, 1, 2 (Broute force solution)
import java.util.*;

// public class Array14 {

//     public static int[] sortArray(int arr[], int n) {
//         Arrays.sort(arr);
//         return arr;
//     }

//      public static void main(String args[]) {
//         int n = 6;
//         int arr[] = {0, 2, 1, 2, 0, 1}; 
//         int newArray[] = sortArray(arr, 6);
//         for(int i=0; i<n; i++) {
//             System.out.print(newArray[i] + " ");
//         }   
//     }
// }



// Sort of array based on 0, 1, 2 ( Better Approach )

// public class Array14 {

//     public static void sortArray(int arr[], int n) {
//         int count0 = 0;
//         int count1 = 0;
//         int count2 = 0;
//         for(int i=0; i<n; i++) {
//             if(arr[i] == 0 )
//                 count0++;
//             else if(arr[i] == 1)
//                 count1++;
//             else 
//                 count2++;
//         }

//         while( count0 > 0 ) {
//             System.out.print(0 + " ");
//             count0--;
//         } 
//         while( count1 > 0 ) {
//             System.out.print( 1 + " ");
//             count1--;
//         } 
//         while( count2 > 0 ) {
//             System.out.print( 2 + "  ");
//             count2--;
//         } 
//     }

//      public static void main(String args[]) {
//         int n = 6;
//         int arr[] = {0, 2, 1, 2, 0, 1}; 
//         sortArray(arr, 6); 
//     }
// }



//Optimal Solution ( Dutch National flag Algorithm )

public class Array14 { 
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortArray(int arr[], int n) { 
        int mid = 0, low = 0, high = n-1;
        while( mid <= high ) {
            if(arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
                mid++;
            else {
                swap(arr, mid, high);
                high--;
            }
        } 
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

     public static void main(String args[]) { 
        int arr[] = {0, 2, 1, 2, 0, 1}; 
        sortArray(arr, 6); 

    }
}