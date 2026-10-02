class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(ch);
            }
            else if(ch==stack.peek())
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        String k="";
        while(!stack.isEmpty())
        {
            char j=stack.pop();
            k+=j;
        }
        String l="";
        for(int i=k.length()-1;i>=0;i--)
        {
            l+=k.charAt(i);
        }
        return l;
        
    }
}