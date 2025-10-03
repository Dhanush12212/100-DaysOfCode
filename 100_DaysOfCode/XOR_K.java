import java.util.*;

public class XOR_K {

    //Brute force approach( using loops )
    // public static int subarraysWithXorK(int a[], int k) {
    //     int count = 0;
    //     int n = a.length;
    //     for(int i=0; i<n; i++) {
    //         for(int j=i; j<n; j++) {
    //             int XOR = 0;
    //             for(int l=i; l<=j; l++) {
    //                 XOR = XOR ^ a[l];
    //             }
    //             if(XOR == k) 
    //                 count ++;
    //         }
    //     }
    //     return count;
    // }



    //Better Approach
    //public static int subarraysWithXorK(int a[], int k) {
    //    int count = 0;
    //    int n = a.length;
    //    for(int i=0; i<n; i++) {
    //        int XOR = 0; 
    //        for(int j=i; j<n; j++) {
    //            XOR = XOR ^ a[j]; 
    //            if(XOR == k) 
    //                count ++;
    //        }
    //    }
    //    return count;
    // }


    //Optimal Solution
    public static int subarraysWithXorK(int a[], int k) {
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int count = 0;
        for(int i=0; i<a.length; i++) {
            xr = xr ^ a[i];
            int x = xr ^ k;
            count += mpp.getOrDefault(x, 0);
            mpp.put(xr, mpp.getOrDefault(xr,0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {   
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
