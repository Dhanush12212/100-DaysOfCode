//Longest Consecutive Sequence
import java.util.*;

//Brute force approach

// public class Array18 {
//     public static boolean linearSearch(int arr[], int num, int n) {
//         for(int i=0; i<n; i++) {
//             if(arr[i] == num) 
//                 return true;
//         }
//         return false;
//     }

//     public static int findConsecutive(int arr[], int n) {
//         int longest = 1;
//         for(int i=0; i<n; i++) {
//             int count = 0;
//             int ind = arr[i];
//             while( linearSearch(arr, ind+1, n) == true ) {
//                 count += 1;
//                 ind += 1;
//             }
//             longest = Math.max(count, longest);

//         }
//         return longest;
            
//     }

//     public static void main(String[] args) {
//         int arr[] = {0,3,7,2,5,8,4,6,0,1};
//         int n = arr.length;
//         System.out.println("The Leaders of the array is: "+ findConsecutive(arr, n));
//     }
// }



//Better approach (Sorting)  

// public class Array18 {
//     public static int findConsecutive(int []a) {
//         int n = a.length;
//         if (n == 0) return 0;
 
//         Arrays.sort(a);
//         int lastSmaller = Integer.MIN_VALUE;
//         int cnt = 0;
//         int longest = 1;
 
//         for (int i = 0; i < n; i++) {
//             if (a[i] - 1 == lastSmaller) { 
//                 cnt += 1;
//                 lastSmaller = a[i];
//             } else if (a[i] != lastSmaller) {
//                 cnt = 1;
//                 lastSmaller = a[i];
//             }
//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int arr[] = {0,3,7,2,5,8,4,6,0,1}; 
//         System.out.println("The Leaders of the array is: "+ findConsecutive(arr));
//     }
// } 

//Optimal Solution (Hash set) 

public class Array18 {
    public static int findConsecutive(int[] arr) {
        int longest = 1;  
        if(arr.length == 0 )
            return 0; 
        Set<Integer> set = new HashSet<>();
        for(int num: arr) {
            set.add(num);
        }

        for(int num : set) {
            if(!set.contains(num-1)) {
                int cnt = 1;
                int x = num;
                while(set.contains(x+1)) {
                    cnt += 1;
                    x = x+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,8,4,6,0,1}; 
        System.out.println("The Leaders of the array is: "+ findConsecutive(arr));
    }
}
