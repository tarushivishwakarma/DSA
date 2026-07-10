class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int n=0;
        int last=0;
        for(int i=1;i<intervals.length;i++){
            if((intervals[i][0]<intervals[last][1])){
                n++;
            }
            else{
                last=i;
            }
        }
        return n;
    }
}