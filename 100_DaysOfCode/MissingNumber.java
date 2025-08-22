import java.util.HashMap;

public class MissingNumber {

    //Brute force solution ( 2 for loops, TC -> O(n^2) )
    // public static int findNumber(int arr[], int n) {
    //     for(int i=1; i<=n; i++) {
    //         boolean found = false;
    //         for(int j=0; j<n; j++) {
    //             if(arr[j] == i ) {
    //                 found = true;
    //                 break;
    //             }
    //         }
    //         if(!found) {
    //             return i;
    //         }
    //     } 
    //     return -1; 
    // }


    //Better approach ( HashMap, TC -> O(n) + O(n) )
    // public static int findNumber(int arr[], int n) {
        
    //     HashMap<Integer, Integer> hash = new HashMap<>();
    //         for(int i=0; i< n; i++) {
    //             hash.put(arr[i], 1);
    //         }

    //         for(int i=1; i<=n; i++) {
    //             if(!hash.containsKey(i))
    //                 return i;
    //         }
    //     return -1;
        
    // }

    //Optimal Solution (Sum of natural numbers, TC - O(n)) 
    public static int findNumber(int arr[] , int n) {
        int N = arr[n-1];
        int total = N*(N+1) / 2; 
        int sum = 0;
 
        for(int i=0; i<n; i++) {
            sum += arr[i];
        } 

        if(sum != total)
            return total - sum;

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int n = arr.length;
        System.out.println("Missing Number is: "+findNumber(arr, n));
    }
}
