//Product of Array except self

public class Main {

    //Brute-Force approach -> O(n^2)
    // public static int[] productExceptSelf(int nums[]) {
    //     int n =nums.length;
    //     int result[] = new int[n];
    //     for(int i = 0; i<n; i++) {
    //         int prod = 1;
    //         for(int j=0; j<n; j++) {
    //             if( i != j) {
    //                 prod *= nums[j];
    //             }
    //         }
    //         result[i] = prod;
    //     }
    //     return result;
    // }


    //Optimal solution ( TC -> O(n))
    public static int[] productExceptSelf(int nums[]) {
        int n = nums.length;
        int result[] = new int[n];
 
        result[0] = 1;
        for(int i=1; i<n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int postfix = 1;
        for(int i=n-1; i>=0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {   
        int nums[] = { 1, 2, 3, 4};
        int result[] = productExceptSelf(nums);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
