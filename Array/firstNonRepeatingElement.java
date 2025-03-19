import java.util.*;
public class firstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 9, 6, 7, 4 };
        System.out.println(firstNonRepeating(arr));
    }

    public static int firstNonRepeating(int[] arr) {
        int[] freq = new int[256];
        
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int num : arr) {
            if (freq[num] == 1) {
                return num;
            }
        }
        return -1;
    }
}
