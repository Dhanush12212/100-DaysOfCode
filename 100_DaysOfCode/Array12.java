// Majority Element (Brute force solution) 

// class Array12 {
//     public static List<Integer> majorityElement(int[] nums) {
//         List<Integer> ls = new ArrayList<>();
//         int n = nums.length-1;
//         for(int i=0; i<n; i++) {
//             if( ls.size() == 0 || ls.get(0) != nums[i]) {
//                 int count = 0;
//                 for(int j=0; j<n; j++) {

//                     if(nums[i] == nums[j] )
//                         count++;
                
//                 }
//                 if(count > (n/3))
//                 ls.add(nums[i]);
//             }
//             if(ls.size() ==2)
//                 break;
//         }
//         return ls;
//     }
//      public static void main(String args[]) {
//         int[] arr = {11, 33, 33, 11, 33, 11};
//         List<Integer> ans = majorityElement(arr);
//         System.out.print("The majority elements are: ");
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }



//Majority Element ( Using HashMap)

import java.util.*;
class Array12 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int min = nums.length/3;
        for(int i=0; i<nums.length; i++ ) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            if(mpp.get(nums[i]) > min && !ls.contains(nums[i])) 
                ls.add(nums[i]);
        }
        return ls;
    }
    public static void main(String args[]) {
        int[] nums = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(nums);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}