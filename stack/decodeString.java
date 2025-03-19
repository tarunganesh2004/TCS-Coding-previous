package stack;
import java.util.*;
public class decodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodestring(s));
    }

    public static String decodestring(String s){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                st.push(ch);
            } else {
                StringBuilder sb = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    sb.insert(0, st.pop());
                }
                st.pop();
                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.insert(0, st.pop());
                }
                int k = Integer.parseInt(num.toString());
                String str = sb.toString();
                while (k-- > 0) {
                    for (char c : str.toCharArray()) {
                        st.push(c);
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.insert(0, st.pop());
        }
        return res.toString();
    }
}
