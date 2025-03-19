import java.util.*;
public class commonSubsequence {
    public static void main(String[] args) {
        String a = "ABEF";
        String b = "CADE";
        System.out.println(commonSubsequence(a, b));
    }

    public static boolean commonSubsequence(String a, String b) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : a.toCharArray()) {
            set.add(ch);
        }
        for (char ch : b.toCharArray()) {
            if (set.contains(ch)) {
                return true;
            }
        }
        return false;
    }
}
