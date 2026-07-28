class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String w=words[i];
            for(int j=0;j<w.length();j++){
                char ch=w.charAt(j);
                if(ch==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}