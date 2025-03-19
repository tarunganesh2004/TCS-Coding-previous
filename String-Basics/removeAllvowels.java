public class removeAllvowels {
    public static void main(String[] args) {
        String s = "aeiotguhero";
        System.out.println(removeAllVowels(s));
    }

    public static String removeAllVowels(String s) {
        String res = "";
        for (char ch : s.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                res += ch;
            }
        }
        return res;
    }

    public static String removeSpaces(String s) {
        String res = "";
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                res += ch;
            }
        }
        return res;
    }

    // remove characters from a string except alphabets
    public static String removeSpecialCharacters(String s) {
        String res = "";
        for (char ch : s.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                res += ch;
            }
        }
        return res;
    }
}
