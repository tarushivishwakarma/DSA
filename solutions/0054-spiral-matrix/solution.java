class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int srow=0;
        int scol=0;
        int erow=n-1;
        int ecol=m-1;
        List<Integer> ans=new ArrayList<>();
        while ((srow<=erow) && (scol<=ecol)){
            for(int i=scol;i<=ecol;i++){
                ans.add(matrix[srow][i]);
            }
            srow++;
            //last col
            for(int i=srow;i<=erow;i++){
                ans.add(matrix[i][ecol]);
            }
            ecol--;
            //last row
            if(srow<=erow){
                for(int i=ecol;i>=scol;i--){
                    ans.add(matrix[erow][i]);
                }
            erow--;
            }
            //scol
            if(scol<=ecol){
                for(int i=erow;i>=srow;i--){
                    ans.add(matrix[i][scol]);
                }
                scol++;
            }
        }
        return ans;
    }
}
