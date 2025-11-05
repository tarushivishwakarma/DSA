class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int row=0;
        int col=0;
        int idx=0;
        int ans[]=new int[m*n];
        while(idx<m*n){
            ans[idx]=mat[row][col];
            idx++;
            if((row+col)%2==0){
                if(col==n-1)
                row++;
                else if(row==0)
                col++;
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==m-1)
                col++;
                else if (col==0)
                row++;
                else{
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}
