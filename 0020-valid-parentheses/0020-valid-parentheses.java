class Solution {
    public boolean isValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='[')
                st.push(ch);
            else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{')
                    return false;
                st.pop();
            }
            else if(ch==')'){
                if(st.isEmpty() || st.peek()!='(')
                    return false;
                st.pop();
            }
            else if(ch==']'){
                if(st.isEmpty() || st.peek()!='[')
                    return false;
                st.pop();
            }
            else{
                return false;
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}