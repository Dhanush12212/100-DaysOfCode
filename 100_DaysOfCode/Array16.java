import java.util.*;

//Rearraging the array elements by sign (Brute Force Approach)

// public class Array16 {
//     public static int[] RearrangebySign(int A[], int n) {
//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();

//         for(int i=0; i<n; i++) {
//             if(A[i] > 0)
//                 pos.add(A[i]);
//             else 
//                 neg.add(A[i]);
//         }

//         for(int i=0; i<n/2; i++) {
//             A[i*2] = pos.get(i);
//             A[i*2+1] = neg.get(i);
//         }
//         return A;
//     }
//     public static void main(String args[]) {
//         int n = 4;
//         int A[]= {1,2,-4,-5};
//         int[]ans= RearrangebySign(A,n);
//         for (int i = 0; i < n; i++) {
//           System.out.print(ans[i]+" ");
//         }
//     }
// }


//Optimal Solution

public class Array16 {
    public static int[] rearrangeArray(int[] nums) { 
        int n = nums.length;
        int A[] = new int[n];
        int pos = 0, neg = 1;
        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                A[pos] = nums[i];
                pos += 2;
            }
            else {
                A[neg] = nums[i];
                neg += 2;
            } 
        }
        return A;
    }
    public static void main(String args[]) {
        int n = 4;
        int A[]= {1,2,-4,-5};
        int[] ans= rearrangeArray(A);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
