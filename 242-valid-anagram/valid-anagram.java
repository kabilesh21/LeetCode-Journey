class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        int max=0;
        if(s.length()>=t.length())
        {
            max=s.length();
        }
        else
        {
            max=t.length();
        }
        if(s.length()==t.length())
        {
            for(int i=0;i<max;i++)
            {
                char ch1=s.charAt(i);
                char ch2=t.charAt(i);
                arr[ch1-'a']+=1;
                arr[ch2-'a']-=1;

            }
        }int c=0;
        if(s.length()==t.length()){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            {
                c++;
            }
        }}
        if(c==26){
        return true;}
        return false;
    }
}