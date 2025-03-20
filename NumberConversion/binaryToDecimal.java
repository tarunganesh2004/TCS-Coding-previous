public class binaryToDecimal {
    public static void main(String[] args) {
        String s = "1011";
        // int n = Integer.parseInt(s, 2); // Using Integer.parseInt() method
        System.out.println(convert(s));
    }

    public static int convert(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = n * 2 + (s.charAt(i) - '0');
        }
        return n;
    }

    // understandable
    public static int convert2(String s) {
        int n = s.length();
        int base = 1;
        int result = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                result += base;
            }
            base *= 2;
        }

        return result;
    }
}
