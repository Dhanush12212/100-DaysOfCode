//Longest Subarray that sum k (Optimal Solution -> HashMap)

import java.util.*;
public class array8 {
    public static int getLongestSubarray(int arr[], int k) {
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for(int i=0; i< arr.length; i++) {
            sum += arr[i];

            if( sum == k )
                maxLen = Math.max(maxLen, i+1);
            
            long rem = sum - k;
            
            if(preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if( !preSumMap.containsKey(sum))
                preSumMap.put(sum, i);
        }
        return maxLen;

    }

   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 5;
        System.out.println("Longest subarray length with sum " + k + " is: " + getLongestSubarray(arr, k));
    }
}
