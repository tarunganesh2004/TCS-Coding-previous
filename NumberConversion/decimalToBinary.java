public class decimalToBinary {
    public static void main(String[] args) {
        int n = -15;
        System.out.println(convert(n));
    }

    public static String convert(int n) {
        // built in , Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            sb.append(remainder);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}
