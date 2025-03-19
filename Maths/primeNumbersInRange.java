package Maths;

public class primeNumbersInRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        primeNumbersInRange(start, end);
    }

    public static void primeNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }

        }
        return true;
    }
}
