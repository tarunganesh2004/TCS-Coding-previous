package recursion;
import java.util.*;
public class subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        subsetsg(nums);
    }

    public static void subsetsg(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsetsUtil(nums, 0, subset, res);
        for(List<Integer> l:res){
            System.out.println(l);
        }
    }

    public static void subsetsUtil(int[] nums, int index, List<Integer> subset, List<List<Integer>> res) {
        res.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            subsetsUtil(nums, i + 1, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
    
}
