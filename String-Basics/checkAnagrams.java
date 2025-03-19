public class checkAnagrams {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        System.out.println(checkAnagrams(a, b));

    }
    public static boolean checkAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] arr = new int[256];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)]++;
            arr[b.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
