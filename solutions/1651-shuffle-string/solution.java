class Solution {
    public String restoreString(String s, int[] indices) {
        char[] shuffle=new char[s.length()];
        for(int i=0;i<s.length();i++){
            shuffle[indices[i]]=s.charAt(i);
        }
        return new String(shuffle);
    }
}
