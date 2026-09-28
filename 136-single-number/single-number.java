class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j)
                {
                    c+=1;
                }
            }
            if(c==0)
            {
                s=nums[i];
                
            }c=0;
        }
        return s;
    }}
        