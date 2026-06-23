class Solution {
    boolean ispossible(int[] position,int mid,int m){
        int ball=1;
        int pos=position[0];
        for(int i=1;i<position.length;i++){
            if((position[i]-pos)>=mid){
                ball++;
                pos=position[i];
            }
            if(ball==m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start=1;
        int end=position[position.length-1];
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2; //atleast mid distance between two balls
            if(ispossible(position,mid,m)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return ans;
    }
}
