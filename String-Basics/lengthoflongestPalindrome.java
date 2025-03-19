public class lengthoflongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            maxLen = Math.max(maxLen, Math.max(len1, len2));
        }
        return maxLen;
    }
    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
