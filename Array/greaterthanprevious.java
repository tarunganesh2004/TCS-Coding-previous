class greater {
    public static void main(String[] args) {
        int[] arr = { 7,4,8,2,9 };
        System.out.println(greaterThanPrevious(arr));
    }

    public static int greaterThanPrevious(int[] arr) {
        int n = arr.length;
        // 1st element is always greater than previous
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                c++;
            }

        }
        return c;
    }
}