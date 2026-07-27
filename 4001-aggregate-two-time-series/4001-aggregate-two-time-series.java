class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        int j=0;
        int m=0;
        int n=0;
        while(i<series1.length || j<series2.length){
            int a;
            if(j==series2.length || (i<series1.length && series1[i][0]<series2[j][0])){
                a=series1[i][0];
                i++;
            }
            else if(i==series1.length || series2[j][0]<series1[i][0]){
                a=series2[j][0];
                j++;
            }
            else{
                a=series1[i][0];
                i++;
                j++;
            }
            while(m<series1.length && series1[m][0]<a)
                m++;
            while(n<series2.length && series2[n][0]<a)
                n++;
            int y=0;
            int z=0;
            if(m<series1.length)
                y=series1[m][1];
            if(n<series2.length)
                z=series2[n][1];
            ans.add(Arrays.asList(a,y+z));
        }
        return ans;
    }
}