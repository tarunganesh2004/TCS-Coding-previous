package recursion;

import java.util.*;
class combinationSum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        combinationSumres(nums, target);
    }

    public static void combinationSumres(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, target, new ArrayList<>(), res, 0);
        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }
    
    public static void backtrack(int[] nums, int target, List<Integer> temp, List<List<Integer>> res, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, target - nums[i], temp, res, i);
            temp.remove(temp.size() - 1);
        }
    }
}