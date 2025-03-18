import java.io.*;

class test {
    // public static void main(String[] args) {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String in = "";
    //     try {
    //         in = br.readLine();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    //     String[] arr = in.split(" ");
    //     int[] a = new int[arr.length];
    //     for (int i = 0; i < arr.length; i++) {
    //         a[i] = Integer.parseInt(arr[i]);
    //     }
    //     for (int i : a) {
    //         System.out.print(i + " ");
    //     }
    // }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = null;
        try{
             int n = Integer.parseInt(br.readLine());

        // read space separated elements
        String[] arr = br.readLine().split(" ");
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    if (a != null) {
            for (int i : a) {
            System.out.print(i + " ");
        }
        }
       
    }
}