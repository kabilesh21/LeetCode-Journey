import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arr=new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            arr.add(nums[i]);
        }
        int k=arr.size();
        int m=nums.length;
        if(k==m)
        {
            return false;
        }
        return true;
    }}
       