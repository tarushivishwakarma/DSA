class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=1;
            String val=sentences[i];
            for(int j=0;j<val.length();j++){
                if(val.charAt(j)==' ')
                    count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}