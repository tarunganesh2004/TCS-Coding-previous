import java.util.*;

class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // arr is primitive type
        // to convert arr as list we should convert it to Integer[]
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.asList(arr1);
        System.out.println(list);
        list.add(6); // this will give error.because list is fixed size
    }
}