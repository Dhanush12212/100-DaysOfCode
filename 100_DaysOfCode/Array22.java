//Merge Overlapping Subintervals

import java.util.*;
public class Array22 { 
    public static List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart <= end) {
                end = Math.max(end, currEnd); 
            } else {
                ans.add(Arrays.asList(start, end));
                start = currStart;
                end = currEnd;
            }
        }

        ans.add(Arrays.asList(start, end));
        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> result = merge(intervals);

        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }
    }
}
