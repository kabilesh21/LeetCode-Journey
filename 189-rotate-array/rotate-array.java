class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int f=0;
        int l=nums.length-1;
        while(f<=l)
        {
            int temp=nums[f];
            nums[f]=nums[l];
            nums[l]=temp;
            f++;
            l--;
        }
        f=0;
        l=k-1;
        while(f<=l)
        {
            int temp=nums[f];
            nums[f]=nums[l];
            nums[l]=temp;
            f++;
            l--;
        }
        f=k;
        l=nums.length-1;
        while(f<=l)
        {
            int temp=nums[f];
            nums[f]=nums[l];
            nums[l]=temp;
            f++;
            l--;
        }

    }}
        
        