class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        boolean f=false;
        for(int i=1;i<num;i++){
            if(num%i==0)
            {
                sum+=i;
            }

        }
        if(sum==num)
        {
            f=true;
        }
        return f;
    }
}