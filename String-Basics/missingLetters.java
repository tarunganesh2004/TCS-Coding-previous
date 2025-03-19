import java.util.*;
public class missingLetters {
    public static void main(String[] args) {
        String s = "The four boxing wizard starts over the quickly";
        System.out.println(missingLetters1(s));
    }

    public static String missingLetters1(String s) {
        s = s.toLowerCase();
        // String res = "";
        // for (char i = 'a'; i <= 'z'; i++) {
        //     if (s.indexOf(i) == -1) {
        //         res += i;
        //     }
        // }
        // return res;
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        for (char ch = 'a';ch<='z';ch++){
            if(!set.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
