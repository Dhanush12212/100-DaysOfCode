//Longest SubArray that sum k (Brute Force Approach)

public class Array7 {
    public static int findMaxSubArray(int arr[], int n, int k) {
        for(int st=0; st<n; st++) {
            int sum = 0; 
            for(int end=st; end<n; end++) {

                    sum += arr[end];  
                
                if(sum == k)
                    return (end-st+1); 
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        
        int result = findMaxSubArray(arr, 5, 10);
        System.out.println("The Length of the longest subarray that sum k: "+ result);
    }
}
