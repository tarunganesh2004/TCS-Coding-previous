public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int total = (n+1) * (n + 2) / 2;
        return total - sum;
    }
}
