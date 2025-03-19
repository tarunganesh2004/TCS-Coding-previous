import java.util.*;
public class reverseWords {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        // System.out.println(Arrays.toString(reverseWords1(s)));
        System.out.println(reverseWords1(s));
    }

    public static String reverseWords1(String s) {
        String[] arr = s.split("\\.");
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}
