//Sum of Maximum subArray  ( Better Aproach )

import java.util.*;
// public class Array15 {
//     public static int maxSubarraySum(int arr[], int n) {
//         int maximum = Integer.MIN_VALUE;

//         for(int i=0; i<n; i++) {
//             int sum = 0;
//             for(int j=i; j<n; j++) {
//                 sum += arr[j];
//                 maximum = Math.max( maximum, sum );
//             } 
//         }
//         return maximum;
//     }   
    
//     public static void main(String args[]) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int n = arr.length;
//         int maxSum = maxSubarraySum(arr, n);
//         System.out.println("The maximum subarray sum is: " + maxSum);

//     }
// }

//Maximum sum of subarray (Kadane's algorithm) -> O(n)
public class Array15 {
    public static int maxSubarraySum(int arr[], int n) {
        int maximum = Integer.MIN_VALUE;

        int sum = 0; 
        for(int i=0; i<n; i++) {

            sum += arr[i];

            if(sum < 0 ) {
                sum = 0;
            }
            maximum = Math.max(maximum, sum);

            //for empty subarray
            if (maximum < 0) 
                maximum = 0;
        }
        return maximum;
    }   
    
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
