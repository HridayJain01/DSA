package Recursion;
import java.util.ArrayList;

public class Subsequence {
    public static void subs(int ind, int[] nums, ArrayList<Integer> current) {
        int n = nums.length;
        if (ind >= n) {
            System.out.println(current);
            return;
        }
        current.add(nums[ind]);
        subs(ind + 1, nums, current);
        current.remove(current.size() - 1);
        subs(ind + 1, nums, current);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> current = new ArrayList<>();
        subs(0, nums, current);
    }
}
