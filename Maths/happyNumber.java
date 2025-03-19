package Maths;
import java.util.*;
public class happyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        // int slow = n;
        // int fast = n;
        // do {
        //     slow = digitSquareSum(slow);
        //     fast = digitSquareSum(digitSquareSum(fast));
        // } while (slow != fast);
        // return slow == 1;
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = digitSquareSum(n);
        }
        return n == 1;
    }
    
    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
