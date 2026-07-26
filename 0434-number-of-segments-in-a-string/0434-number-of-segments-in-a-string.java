class Solution {
    public int countSegments(String s) {
        int count=0;
        int i=0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' ')
                i++;
            if(i<s.length() && s.charAt(i)!=' '){
                count++;
                while(i<s.length() && s.charAt(i)!=' ')
                    i++;
            }
        }
        return count;
    }
}