import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c = target - arr[i];
            if(m.containsKey(c)){
                System.out.println(m.get(c) + " " + i);
                break;
            } else {
                m.put(arr[i], i);
            }
        }
    }
}
