import java.util.*;
public class replaceWithRank {
    public static void main(String[] args) {
        int[] arr = { 20, 15, 26, 2, 98, 6 }; // 4 3 5 1 6 2;
        System.out.println(Arrays.toString(replaceWithRank(arr)));
    }

    public static int[] replaceWithRank(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int r = 1;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if (map.containsKey(temp[i])) {
                continue;
            }
            map.put(temp[i], r);
            r++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
