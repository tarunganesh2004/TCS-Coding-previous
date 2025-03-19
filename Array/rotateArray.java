// rotate array
import java.util.*;
class rotateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        int k = sc.nextInt();
        // rotate(arr, k);
        // rotateByLeft(arr, k);
        rotateAnother(arr, k);
        System.out.println(Arrays.toString(arr));
        
    }

    // rotate by right(4,5,1,2,3)
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        int[] temp = new int[n];
        for (int i = 0; i < k; i++) {
            System.out.println(i + " " + (n - k + i));
            temp[i] = arr[n - k + i];
        }
        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    public static void rotateByLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        // 1,2,3,4,5, k=2
        // 3,4,5,1,2
        for (int i = k; i < n; i++) {
            temp[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[n - k + i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    // recursion approach
    public static void rotateAnother(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr,int l,int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}