import java.util.*;

class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,1 };
        // arr is primitive type
        // to convert arr as list we should convert it to Integer[]
        // Integer[] arr1 = { 1, 2, 3, 4, 5 };
        // List<Integer> list = Arrays.asList(arr1);
        // System.out.println(list);
        // list.add(6); // this will give error.because list is fixed size

        // Map usage
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : arr) {
            if (m.containsKey(num)) {
                m.put(num, m.get(num) + 1);
            } else {
                m.put(num, 1);
            }
        }
        System.out.println(m);
        // iterating
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}