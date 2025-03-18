import java.io.*;
import java.util.*;

class test {
    // public static void main(String[] args) {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String in = "";
    // try {
    // in = br.readLine();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // String[] arr = in.split(" ");
    // int[] a = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // a[i] = Integer.parseInt(arr[i]);
    // }
    // for (int i : a) {
    // System.out.print(i + " ");
    // }
    // }

    // public static void main(String[] args) {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int[] a = null;
    // try{
    // int n = Integer.parseInt(br.readLine());

    // // read space separated elements
    // String[] arr = br.readLine().split(" ");
    // a = new int[n];
    // for(int i = 0; i < n; i++) {
    // a[i] = Integer.parseInt(arr[i]);
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // if (a != null) {
    // for (int i : a) {
    // System.out.print(i + " ");
    // }
    // }

    // }
    // public static void main(String[] args) {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     // String
    //     String str = "";
    //     char c = ' ';
    //     try {
    //         str = br.readLine();
    //         // reading a single character
    //         c = (char) br.read();

    //     } catch (IOException e) {
    //         e.printStackTrace();

    //     }
    //     System.out.println(str + " " + c);
    // }

    // public static void main(String[] args) throws IOException {
    //     // Handling multiple test cases
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int t = Integer.parseInt(br.readLine());
    //     List<int[]> list = new ArrayList<>();
    //     while (t-- > 0) {
    //         // int n = Integer.parseInt(br.readLine());
    //         String[] arr = br.readLine().split(" ");
    //         int n=arr.length;
    //         int[] a = new int[n];
    //         for (int i = 0; i < n; i++) {
    //             a[i] = Integer.parseInt(arr[i]);
    //         }
    //         // for (int i : a) {
    //         //     System.out.print(i + " ");
    //         // }
    //         list.add(a);
    //         // System.out.println();
    //     }
    //     for (int[] a : list) {
    //         for (int i : a) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int rows = Integer.parseInt(br.readLine());
    //     int cols = Integer.parseInt(br.readLine());
    //     int[][] a = new int[rows][cols];
    //     for (int i = 0; i < rows; i++) {
    //         String[] arr = br.readLine().split(" ");
    //         for (int j = 0; j < cols; j++) {
    //             a[i][j] = Integer.parseInt(arr[j]);
    //         }
    //     }
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             System.out.print(a[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<int[][]> list = new ArrayList<>();
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
        String[] size = br.readLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        int[][] a = new int[rows][cols];
        for (int i = 0; i < a.length; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(arr[j]);
            }
        }
        list.add(a);
    }
    for (int[][] a : list) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
}