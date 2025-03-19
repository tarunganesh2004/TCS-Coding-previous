package Maths;

class prime {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(checkPrime(n));
    }

    public static boolean brute(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
        for (int i = 5; i * i <= n; i +=6) { // 6k+1
            if (n % i == 0|| n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}