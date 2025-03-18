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

public static void main(String[] args) throws IOException {
    // Handling multiple test cases
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    List<int[]> list = new ArrayList<>();
    while (t-- > 0) {
        // int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int n=arr.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        // for (int i : a) {
        //     System.out.print(i + " ");
        // }
        list.add(a);
        // System.out.println();
    }
    for (int[] a : list) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
}
