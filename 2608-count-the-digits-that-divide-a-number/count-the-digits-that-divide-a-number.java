class Solution {
    public int countDigits(int num) {
        int k=num;
        int c=0;
        while(k>0)
        {
            int d=k%10;
            if(num%d==0)
            {
                c++;
                k/=10;
                
            }
            else{
                k/=10;
            }
        
            
        }
        return c;
    }
}