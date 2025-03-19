public class maxProductSubArray {
    public static void main(String[] args) {
        int[] arr = { 6, -3, -10, 0, 2 };
        System.out.println(maxProductSubArray(arr));

    }

    public static int maxProductSubArray(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
