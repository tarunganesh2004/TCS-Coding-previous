package Maths;

public class automorphicNumber {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(isAutomorphic(n));
    }

    public static boolean isAutomorphic(int n) {
        int s = n * n;
        while (n > 0) {
            if (n % 10 != s % 10) {
                return false;
            }
            n /= 10;
            s /= 10;
        }
        return true;
    }
}
