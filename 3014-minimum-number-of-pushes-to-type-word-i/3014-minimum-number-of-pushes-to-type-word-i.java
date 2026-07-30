class Solution {
    public int minimumPushes(String word) {
        int press=0;
        int j=1;
        for(int i=0;i<word.length();i++){
            if(i<8*j)
                press+=j;
            else{
                j++;
                press+=j;
            }
        }
        return press;
    }
}