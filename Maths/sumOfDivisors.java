package Maths;

public class sumOfDivisors {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(sumDivisors(n));
    }

    public static int sumDivisors(int n) {
        // int sum = 0;
        // for (int i = 1; i < n; i++) {
        //     if (n % i == 0) {
        //         sum += i;
        //     }
        // }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
