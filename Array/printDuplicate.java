import java.util.*;
public class printDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 4, 1, 2, 4, 5, 2, 4,3, 5, 6 };
        System.out.println(nonDuplicate(arr));
        System.out.println(nonDuplicateElement(arr));
    }

    // using map
    public static int nonDuplicate(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // using frequency array
    public static int nonDuplicateElement(int[] arr) {
        int n = arr.length;
        // List<Integer> ans = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     ans.add(0);
        // }
        // for (int i = 0; i < n; i++) {
        //     int j = arr[i];
        //     ans.set(j - 1, ans.get(j - 1) + 1); // ans[j-1]++

        // }
        int[] ans = new int[1001];
        for (int i = 0; i < n; i++) {
            ans[arr[i]]++;
        }
        for (int num : arr) {
            if (ans[num] == 1) {
                return num;
            }
        }
        return -1;
    }
}
