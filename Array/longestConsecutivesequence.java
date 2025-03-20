import java.util.*;
public class longestConsecutivesequence {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int i : arr) {
            s.add(i);
        }
        int ans = 0;
        for (int i : arr) {
            if (!s.contains(i - 1)) {
                int j = i;
                while (s.contains(j)) {
                    j++;
                }
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
}
