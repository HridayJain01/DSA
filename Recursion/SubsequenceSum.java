package Recursion;
import java.util.ArrayList;

public class SubsequenceSum {
    public static void subs(int ind, int[] nums, ArrayList<Integer> current, int targetSum, int sum,int c) {
        int n = nums.length;
        
        if (ind == n) {
            if(sum == targetSum) {
                System.out.println(current);
                return;
            }
            return;
        }
        current.add(nums[ind]);
        subs(ind + 1, nums, current, targetSum, sum + nums[ind],c);
        
        
        current.remove(current.size() - 1);
        subs(ind + 1, nums, current, targetSum, sum,c);
        
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 1, 5};
        int targetSum = 5;
        int c=0;
        ArrayList<Integer> current = new ArrayList<>();
        subs(0, nums, current, targetSum, 0,c);
    }
}
