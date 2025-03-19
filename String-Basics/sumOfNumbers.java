public class sumOfNumbers {
    public static void main(String[] args) {
        String s = "1abc23";
        System.out.println(sumOfNumbers(s));
    }

    public static int sumOfNumbers(String s) {
        String tempSum = "0";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                tempSum += ch;
            } else {
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }
        sum += Integer.parseInt(tempSum);
        return sum;
    }
}
