import java.util.*;
public class Main {

    //Brute Force (Hashmap) -> O(nlogn)
    // public static int[] topFrequent(int nums[], int k) {
    //     Map<Integer, Integer> mpp = new HashMap<>();
    //     for(int num : nums) {
    //         mpp.put(num, mpp.getOrDefault(num, 0) +1);
    //     }
    //     List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mpp.entrySet());
    //     list.sort((a,b) -> b.getValue() - a.getValue());
    //     int result[] = new int[k];
    //     for(int i=0; i<k; i++) {
    //         result[i] = list.get(i).getKey();
    //     }

    //     return result;
    // }


    //Optimal Solution(Bucket Sort) -> O(n)
    public static int[] topFrequent(int nums[], int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) +1);
        }

        //Create Buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int num : mpp.keySet()) {
            int freq = mpp.get(num);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int result[] = new int[k];
        int i = 0;
        for(int freq = buckets.length-1; freq >= 0; freq--) {
            if(buckets[freq] != null) {
                for(int num : buckets[freq]) {
                    if(i == k) break;
                    result[i++] = num;

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] ={1,2,2,3,3,3};
        int k = 2;
        int res[] = topFrequent(nums, k); 
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i] + " ");
        } 
    }
}
