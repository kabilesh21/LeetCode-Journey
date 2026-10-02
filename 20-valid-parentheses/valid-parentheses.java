class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                stack.push(ch);
            }
            else if(ch==')' && (!stack.isEmpty()))
            {
                
                if(stack.peek()!='(')
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
            else if(ch==']' && (!stack.isEmpty()))
            {
             if(stack.peek()!='[')
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
            else if(ch=='}' && (!stack.isEmpty()))
            {
                 if(stack.peek()!='{')
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(ch);
            }
        }
        if(stack.isEmpty())
        {
        return true;  
        }
        return false;     
    }
}