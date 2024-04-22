package Recursion;

public class Swapping {
    public static void swap(int nums[],int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        
        int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            swap(nums, l+1, r-1);
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,5};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        swap(nums,0,nums.length-1);
        System.out.println("After swapping:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    
}
