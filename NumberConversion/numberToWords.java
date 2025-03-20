public class numberToWords {
    public static void main(String[] args) {
        int n = 7824;
        System.out.println(convert(n));
    }

    private static final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };

    public static String convert(int n) {
        if (n == 0) {
            return "Zero";
        }
        return helper(n).trim();
    }

    public static String helper(int n) {
        String res = "";
        if (n >= 1000) {
            res += ones[n / 1000] + " Thousand ";
            n %= 1000;
        }
        if (n >= 100) {
            res += ones[n / 100] + " Hundred ";
            n %= 100;
        }
        if (n >= 20) {
            res += tens[n / 10] + " ";
            n %= 10;
        }
        if (n > 0) {
            res += ones[n] + " ";
        }
        return res;
    }
}
