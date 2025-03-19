import java.util.*;
public class sortElementsByFrequency {
    public static void main(String[] args) {
        int[] arr = { 5,5,4,6,4 };
        System.out.println(frequencyCount(arr));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,
                (a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
