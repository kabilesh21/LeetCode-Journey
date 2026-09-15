class Solution {
    public int subtractProductAndSum(int n) {
        int m=1;
        int s=0;
        int res=0;
        while(n>0)
        {
            int d=n%10;
            m*=d;
            s+=d;
            n/=10;
        }
        
        res=m-s;
        return res;
    }
}