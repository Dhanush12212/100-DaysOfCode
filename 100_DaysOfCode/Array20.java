//Count of SubArray sum equals to K

import java.util.*;

//Brute force approach

// public class Array20 {
//     public static int findAllSubarraysWithGivenSum(int arr[], int k) {
//         int count = 0;
//         for(int i=0; i<arr.length; i++) {
//             int sum = 0;
//             for(int j=i; j<arr.length; j++) {
//                 sum += arr[j];
                
//                 if(sum == k) {
//                     count ++;
//                 } 
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) { 
//         int[] arr = {3, 1, 2, 4};
//         int k = 6;
//         int cnt = findAllSubarraysWithGivenSum(arr, k);
//         System.out.println("The number of subarrays is: " + cnt);
//     } 
// }



//Optimal Solution (Using HashMap)
public class Array20 {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int count = 0;
        Map<Integer, Integer> mpp =  new HashMap<>();
        mpp.put(0, 1);
        int sum = 0;
        for(int i=0; i<arr.length; i++) { 
            sum += arr[i]; 
            
            int rem = sum - k; 

            //it will check how many k sum is in the map
            count += mpp.getOrDefault(rem, 0);

            //it will add the sum to the map after one iteration
            mpp.put(sum, mpp.getOrDefault(sum, 0 ) + 1);


        }
        return count;
    }

    public static void main(String[] args) { 
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    } 
}
