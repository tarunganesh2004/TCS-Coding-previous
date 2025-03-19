package Maths;

public class expressAsSumofprime {
    public static void main(String[] args) {
        int n = 74;
        express(n);
    }

    public static void express(int n) {
        boolean found = false;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cannot be expressed as sum of two prime numbers");
        }
    }
    public static boolean isPrime(int n) {
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
