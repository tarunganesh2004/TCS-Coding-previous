public class splitaCounts {
    public static void main(String[] args) {
        String s = "bbbaaababa";
        int l = 3;
        System.out.println(splitaCounts(s, l));
    }

    public static int splitaCounts(String s, int l) {
        int count = 0;
        int maxAqua=0;
        for (int i = 0; i < s.length(); i++) {
            if (i % l == 0) {
                maxAqua=Math.max(maxAqua,count);
                count=0;
            }

            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        maxAqua = Math.max(maxAqua, count);
        return maxAqua;
    }
}
