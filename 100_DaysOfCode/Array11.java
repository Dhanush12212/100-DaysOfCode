//Two sum problem (Using Hash MapA)

import java.util.*;
class Array11 {
    public static int[] twoSum(int[] nums, int target) { 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++ ) {
            int remains = target - nums[i];

            if(map.containsKey(remains))
                return new int[] { map.get(remains), i};
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int nums[] = { 2,6,5,8,11 };
        int result[] = twoSum(nums, 15);
        System.out.println("The index of the solution: [ "+ result[0]+ ", " + result[1] + " ]");
    }
}