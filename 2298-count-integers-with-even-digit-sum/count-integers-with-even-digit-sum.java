class Solution {
    public int countEven(int num) {
        
        
        int c=0;
        for(int i=2;i<=num;i++)
        {
            int s=0;
            int n=i;
        while(n>0)
        {
           int d=n%10;
            s+=d;
            n/=10;
        }
        if(s%2==0)
        {
            c++;
        } 
    }
        return c;
    }
}