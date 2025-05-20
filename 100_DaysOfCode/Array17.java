import java.util.*;

//Finding Leaders of the array

//Brute force approach
// public class Array17 {

//     public static List<Integer> findLeaders(int arr[], int n) {
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<n; i++) {
            
//             boolean flag = true; 
//             for(int j=i+1; j<n; j++) {
//                 if(arr[i] < arr[j])  { 
//                     flag = false;
//                     break;
//                 } 
//             }
//             if(flag) 
//                 list.add(arr[i]);
//         }
 
//         return list;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 7, 1, 0};
//         int n = arr.length;
//         System.out.println("The Leaders of the array is: "+ findLeaders(arr, n));
//     }
// }

//Optimal Solution
public class Array17 {

    public static List<Integer> findLeaders(int arr[], int n) {
        List<Integer> list = new ArrayList<>();

        int max = arr[n-1];
        list.add(arr[n-1]);
        
        for(int i=n-2; i>=0; i--) {
            if(arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        } 
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 0};
        int n = arr.length;
        System.out.println("The Leaders of the array is: "+ findLeaders(arr, n));
    }
}
