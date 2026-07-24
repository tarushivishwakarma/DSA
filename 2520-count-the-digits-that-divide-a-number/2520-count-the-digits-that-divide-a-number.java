class Solution {
    public int countDigits(int num) {
        int a=num;
        int count=0;
        while(a!=0){
            int val=a%10;
            if(num%val==0)
                count++;
            a=a/10;
        }
        return count;
    }
}