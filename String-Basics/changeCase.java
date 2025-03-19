public class changeCase {
    public static void main(String[] args) {
        String s = "jaVA";
        System.out.println(changeCase(s));
    }

    public static String changeCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 'a' + 'A'));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch - 'A' + 'a'));
            } else if (ch == ' ') {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
