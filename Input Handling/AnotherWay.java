import java.util.*;

public class AnotherWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        ArrayList<Integer> a = new ArrayList<>();
        String temp = "";
        for (char c : in.toCharArray()) {
            if (Character.isDigit(c)) {
                a.add(c - '0');
            }
            if (Character.isLetter(c)) {
                temp += c;
            }
        }
        System.out.println(a);
        System.out.println(temp);
    }

}

// for infinite integers
class another {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while (true) {
            String x = s2.nextLine();
            if (x.isEmpty()) {
                break;

            }
            a.add(Integer.parseInt(x));
        }
        System.out.println(a);
    }
}

