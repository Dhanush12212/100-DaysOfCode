//Longest SubArray that sum k (Optimal solution -> Two Pointer approach)

public class Array9 {
    public static int getLongestSubarray(int arr[], int k) {
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        int n = arr.length;

        while(right < n) {
            //Sum has to be less than the k
            while(left <= right && sum > k) {
                sum -= arr[left];
                left ++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            right ++;
            if(right < n)
                sum += arr[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 5;
        System.out.println("Longest subarray length with sum " + k + " is: " + getLongestSubarray(arr, k));
    }
}
