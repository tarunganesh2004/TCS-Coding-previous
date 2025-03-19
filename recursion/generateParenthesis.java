package recursion;

public class generateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n);
    }

    public static void generateParenthesis(int n) {
        if (n == 0) {
            return;
        }
        generate(n, 0, 0, "");

    }
    public static void generate(int n,int open,int close,String s) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (open < n) {
            generate(n, open + 1, close, s + "(");
        }
        if (close < open) {
            generate(n, open, close + 1, s + ")");
        }
    }
}
