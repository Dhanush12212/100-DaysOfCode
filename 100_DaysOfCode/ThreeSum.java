// 3 Sum problem

import java.util.*;

public class ThreeSum {

    // Better Approach using Hashset

    // public static List<List<Integer>> triplet(int n, int nums[]) {
    //     Set<List<Integer>> st = new HashSet<>();
    //     for(int i=0; i<n; i++) {
    //         Set<Integer> hashset = new HashSet<>();
    //         for(int j=i+1; j<n; j++) {
    //             int third = -(nums[i] + nums[j]);
    //             if(hashset.contains( third )) {
    //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
    //                 temp.sort(null);
    //                 st.add(temp);
    //             }
    //             hashset.add(nums[j]);
    //         }
    //     }
    //     return new ArrayList<>(st);
    // }


    //Optimal Solution (Using 3 pointers)

    public static List<List<Integer>> triplet(int n, int nums[]) {
        Set<List<Integer>> st = new HashSet<>(); 
        Arrays.sort(nums);
        for(int i=0; i<n; i++) {
            
            if( i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            
            while( j < k ) {

                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum < 0) 
                j++;
                else if(sum > 0) 
                k--;
                else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    st.add(temp);
                    j++;
                    k--;

                    while( j < k && nums[j] == nums[j-1]) j++; 
                    while( j < k && nums[k] == nums[k+1]) k--; 
                }
            }
        }
        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4};
        int n = nums.length;
        List<List<Integer>> ans = triplet(n, nums);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
