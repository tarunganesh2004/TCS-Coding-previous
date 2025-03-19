package recursion;
import java.util.*;
public class permutations {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        permute(nums);
    }

    public static void permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }
    public static void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) { // element already exists skip
                continue;
            }
            temp.add(nums[i]);
            backtrack(nums, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
    // public static void permute(int[] nums) {
    //     permuteUtil(nums, 0);
    // }
    
    // public static void permuteUtil(int[] nums, int idx) {
    //     if (idx == nums.length) {
    //         for (int i = 0; i < nums.length; i++) {
    //             System.out.print(nums[i] + " ");
    //         }
    //         System.out.println();
    //         return;
    //     }
    //     for (int i = idx; i < nums.length; i++) {
    //         swap(nums, i, idx);
    //         permuteUtil(nums, idx + 1);
    //         swap(nums, i, idx);
    //     }

    // }
    // public static void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }
}
