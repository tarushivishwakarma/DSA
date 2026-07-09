class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            int mid=(i+j)/2;
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<=target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}