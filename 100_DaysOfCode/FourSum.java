// 4 Sum problem

import java.util.*;

public class FourSum {   

    // Optimal Solution (Using 2 pointers)

    public static List<List<Integer>> Quadruplet(int n, int target, int nums[]) {
        Set<List<Integer>> st = new HashSet<>(); 
        Arrays.sort(nums);
        for(int i=0; i<n; i++) {
            if( i>0 && nums[i] == nums[i-1] ) continue;

            for(int j=i+1; j<n; j++) {
                if( j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                
                while( k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum == target) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        st.add(temp);
                        k++;
                        l--;

                        while( k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int n = nums.length;
        int target = 0;
        List<List<Integer>> ans = Quadruplet(n, target, nums);
        for (List<Integer> it : ans) {
            System.out.print("[ ");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
