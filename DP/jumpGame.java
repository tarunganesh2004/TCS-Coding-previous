package DP;

public class jumpGame {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + arr[i]);
        }
        return true;
    }
}
