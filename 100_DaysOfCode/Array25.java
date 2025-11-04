//Contains Duplicate

import java.util.HashMap;

public class Array25 {

    public static boolean ContainsDuplicate(int arr[], int n) {
        HashMap<Integer, Boolean> mpp = new HashMap<>(); 
        for(int i=0 ; i<n; i++) {
            if(mpp.containsKey(arr[i])) {
                return true;
            }
            mpp.put(arr[i], true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8;
        boolean ans = ContainsDuplicate(arr, n);
        System.out.println("The array contains duplicates: " + ans);
    }
}
