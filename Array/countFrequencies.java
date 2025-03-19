import java.util.*;
class countFrequencies {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        System.out.println(frequencyCount(arr));
    }

    public static  List<Integer> frequencyCount(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ans.add(0);
        }
        for (int i = 0; i < n; i++) {
            int j = arr[i];
            ans.set(j-1,ans.get(j-1)+1); // ans[j-1]++

        }
        return ans;
    }
}