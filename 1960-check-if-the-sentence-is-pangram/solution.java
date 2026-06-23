class Solution {
    public boolean checkIfPangram(String sentence) {
       /* if(sentence.length()<26)
        return false;
        boolean[] freq=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            int val=ch-97;
            freq[val]=true;
        }
        for(boolean ans:freq){
            if(!ans)
            return false;
        }
        return true;*/

        /* for(char ch='a';ch<='z';ch++){
            if(!sentence.contains (ch+"")){
                return false;
            }
        }
        return true;*/

        
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
