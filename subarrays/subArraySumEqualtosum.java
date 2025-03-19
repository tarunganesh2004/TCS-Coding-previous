package subarrays;

import java.util.*;

public class subArraySumEqualtosum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int sum = 33;
        System.out.println(subArraySum(arr, sum));
    }

    public static boolean subArraySum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == sum) {
                System.out.println("Sum found between indexes 0 to " + i);
                return true;
            }
            if (map.containsKey(prefixSum - sum)) {
                System.out.println("Sum found between indexes " + (map.get(prefixSum - sum) + 1) + " to " + i);
                return true;
            }
            map.put(prefixSum, i);
        }
        return false;
    }
}
