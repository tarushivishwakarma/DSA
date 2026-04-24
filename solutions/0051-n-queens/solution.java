class Solution {
     boolean is_safe(int row, int col, char[][]board, int n)
{
    
    //check for same row 
    for(int i=0;i<n;i++)
    {
        if(board[row][i] == 'Q')
        return false;
    }
    for(int i=0;i<n;i++)
    {
        if(board[i][col] == 'Q')
        return false;
    }
int i=row,j=col;
    //check north east
    while(i>=0 && j<n)
    {
        if(board[i][j]=='Q')
        return false;

        i--;
        j++;
    }
    //check south east
    i=row;
    j=col;
    while(i<n && j<n)
    {
        if(board[i][j]=='Q')
        return false;

        i++;
        j++;
    }
    i=row;
    j=col;

    //check north west
    while(i>=0 && j>=0)
    {
        if(board[i][j]=='Q')
        return false;

        i--;
        j--;
    }
    i=row;
    j=col;

    //check south west
    while(i<n && j>=0)
    {
        if(board[i][j]=='Q')
        return false;

        i++;
        j--;
    }
    return true;
}



    void solve(int row, List<List<String>> ans, char[][]board, int n)  
{
    //base case
    if(row == n)
    {
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str="";
            for(int j=0;j<n;j++)
            {
                str += board[i][j];
            }
            temp.add(str);
        }
        ans.add(temp);     
        return;
    }

    for(int col=0; col<n; col++)
    {
      if (is_safe(row, col, board, n)) {
        board[row][col] = 'Q';

        solve(row + 1, ans, board, n);//iss call se humei ab harr column ke liye check krne ki need nahi

        board[row][col] = '.';//Backtracking
      }
    }
}
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();

    solve(0, ans, board, n);
    return ans;
        
    }
}
