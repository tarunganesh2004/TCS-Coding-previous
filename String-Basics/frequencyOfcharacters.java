public class frequencyOfcharacters {
    public static void main(String[] args) {
        String s = "articles";
        printFrequency(s);
    }
    public static void printFrequency(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                System.out.print((char) i + "" + arr[i]+" ");
            }
        }
    }
}
