class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(ch!=st.peek())
                    st.push(ch);
                else
                    st.pop();
            }
        }
        String res="";
        while(!st.isEmpty())
            res=res+st.removeLast();
        return res;
    }
}