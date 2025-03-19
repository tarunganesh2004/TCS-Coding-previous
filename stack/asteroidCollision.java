package stack;
import java.util.*;
public class asteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[] res = asteroidCollisionn(asteroids);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public static int[] asteroidCollisionn(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int cur = asteroids[i];
            if (cur > 0) {
                stack.push(cur);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(cur)) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(cur);
                } else if (stack.peek() == Math.abs(cur)) {
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
