import java.util.*;
class countFrequencies {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        System.out.println(frequencyCount(arr));
    }

    public static  List<Integer> frequencyCount(int[] arr) { // 1 to n
        int n = arr.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[arr[i]-1]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(freq[i]);
        }
        return res;
    }
}