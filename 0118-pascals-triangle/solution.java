class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=0;row<numRows;row++){
            List<Integer> eachRow=new ArrayList<>();
            long val=1;
            for(int i=0;i<=row;i++){
                eachRow.add((int)val);
                val=(val*(row-i))/(i+1);
            }
            ans.add(eachRow);
        }
        return ans;
    }
}
