import java.util.*;
class inputArray{
    public static void main(String[] args) {
        // Case-1 : [1,2,3,4,5]
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        input = input.replace("[", "").replace("]", ""); // Removing the square brackets
        String[] parts = input.split(","); // split by commas
        int[] arr = new int[parts.length]; // create an array of integers
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]); // parse each element to integer
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}