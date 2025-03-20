public class binaryToOctal {
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(convert(s));
    }

    public static int convert(String s) {
        int n = s.length();
        if (n % 3 == 1) {
            s = "00" + s;
            n += 2;
        } else if (n % 3 == 2) {
            s = "0" + s;
            n += 1;
        }
        int base = 1;
        int result = 0;
        for (int i = n - 1; i >= 0; i -= 3) {
            int num = (s.charAt(i) - '0') * 4 + (s.charAt(i - 1) - '0') * 2 + (s.charAt(i - 2) - '0');
            result = num * base + result;
            base *= 10;
        }

        return result;
    }

    // decimal to octal
    public static int convert2(int n) {
        int result = 0;
        int base = 1;
        while (n > 0) {
            result += n % 8 * base;
            n /= 8;
            base *= 10;
        }
        return result;
    }

    // octal to decimal
    public static int convert3(int n) {
        int result = 0;
        int base = 1;
        while (n > 0) {
            result += n % 10 * base;
            n /= 10;
            base *= 8;
        }
        return result;
    }


    // octal to binary
    public static String convert4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = n % 8;
            sb.append(remainder);
            n /= 8;
        }
        return sb.reverse().toString();
    }
}
