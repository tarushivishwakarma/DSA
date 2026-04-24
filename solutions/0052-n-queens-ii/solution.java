class Solution {
     boolean issafe(char[][]board, int row, int col, int n)
    {
        //check for same row
        for(int i=0;i<n;i++)
        {
            if(board[row][i]=='Q')
            return false;
        }

        //check for same column
        for(int i=0;i<n;i++)
        {
            if(board[i][col] == 'Q')
            return false;
        }

        //check for north west
        int i=row,j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j] == 'Q')
            return false;

            i--;
            j++;
        }
        //check for north east
        i=row;
        j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j] == 'Q')
            return false;

            i--;
            j--;
        }
        //check for south west
         i=row;
        j=col;
        while(i<n && j<n)
        {
            if(board[i][j] == 'Q')
            return false;

            i++;
            j++;
        }
        //check for south east
         i=row;
        j=col;
        while(i<n && j>=0)
        {
            if(board[i][j] == 'Q')
            return false;

            i++;
            j--;
        }

        return true;
    }

    void backTrack(char[][]board, int n,List<List<String>> ans,int row)
    {
        //base case
        if(row == n)
        {
            //how to convert 2-d char array into 2-d list
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String str = "";
                for(int j=0;j<n;j++)
                {
                    str += board[i][j];
                }
                temp.add(str);
            }
            ans.add(temp);
            return;
        }

        //recursive case
        for(int col=0;col<n;col++)
        {
            if(issafe(board,row,col,n))
            {
                board[row][col] = 'Q';
                backTrack(board,n,ans,row+1);
                //Backtracking
                board[row][col] = '.';//empty the cell again
            }
        }
    }
    public int totalNQueens(int n) {
         List<List<String>> ans = new ArrayList<>();
        char[][]board = new char[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }

        backTrack(board,n,ans,0);
        return ans.size();
        
    }
}
