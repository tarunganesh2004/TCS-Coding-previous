import java.util.*;
public class sortTheArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        int i = 0;
        while (c0 > 0) {
            arr[i++] = 0;
            c0--;
        }
        while (c1 > 0) {
            arr[i++] = 1;
            c1--;
        }
        while (c2 > 0) {
            arr[i++] = 2;
            c2--;
        }
    }

    // bubble sort
    public static void sortArrayByBubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
