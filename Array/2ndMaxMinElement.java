class secondminmax {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(secondMax(arr));
        System.out.println(secondMin(arr));
    }

    public static int secondMax(int[] arr) {
        int n = arr.length;
        int f1 = arr[0], f2 = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > f1) {
                f2 = f1;
                f1 = arr[i];
            } else if (arr[i] > f2) {
                f2 = arr[i];
            }
        }
        return f2;
    }

    public static int secondMin(int[] arr) {
        int n = arr.length;
        int f1 = arr[0], f2 = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] < f1) {
                f2 = f1;
                f1 = arr[i];
            } else if (arr[i] < f2) {
                f2 = arr[i];
            }
        }
        return f2;
    }
}