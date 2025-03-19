public class pushZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0 };
        pushZerosToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c++;
            }
        }
        while (c < n) {
            arr[c] = 0;
            c++;
        }
        
    }
}
