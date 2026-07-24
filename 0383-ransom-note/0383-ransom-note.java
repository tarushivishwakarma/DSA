class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
            hs.put(magazine.charAt(i),hs.getOrDefault(magazine.charAt(i),0)+1);
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(!hs.containsKey(ch))
                return false;
            hs.put(ch,hs.get(ch)-1);
            if(hs.get(ch)==0)
                hs.remove(ch);
        }
        return true;
    }
}