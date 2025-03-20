package Greedy;
import java.util.*;
public class mergeOverLappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] res = merge(intervals);
        for (int[] i : res) {
            System.out.println(i[0] + " " + i[1]);
        }
    }

    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                res.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);
    }
}
