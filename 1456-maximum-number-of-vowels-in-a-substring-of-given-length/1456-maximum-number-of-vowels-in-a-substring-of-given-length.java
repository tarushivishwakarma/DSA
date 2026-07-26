class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
        }
        max=count;
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
            char ch1=s.charAt(i-k);
            if(ch1=='a'|| ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
                count--;
            max=Math.max(count,max);
        }
        return max;
    }
}