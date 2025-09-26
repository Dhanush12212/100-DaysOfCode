import java.util.*;

public class array22 { 
    public static int consecutiveZero(int n, int nums[]) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += nums[i];
            if(sum == 0 ) {
                max = i+1;
            }
            else {
                if(hash.get(sum) != null)
                    max = Math.max( max, i-hash.get(sum));
                else
                    hash.put(sum, i);
            }
        }
        return max;
    }

        public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 0, 0, 2, -1, -4};
        int n = nums.length;
        int ans = consecutiveZero(n, nums);
        
        System.out.println(ans);
    }
}
