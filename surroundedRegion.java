class Solution {
    public static void bfs(char[][] board, int i, int j){
        int m = board.length;
        int n = board[0].length;
        if(i<0 || j<0 || i>m-1 || j>n-1)return;
        if(board[i][j]!='O')return;
        board[i][j]='S';
        bfs(board,i-1,j);
        bfs(board,i+1,j);
        bfs(board,i,j-1);
        bfs(board,i,j+1);
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')bfs(board,i,0);
            if(board[i][n-1]=='O')bfs(board,i,n-1);
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O')bfs(board,0,j);
            if(board[m-1][j]=='O')bfs(board,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='S'){
                    board[i][j]='O';
                }else if(board[i][j]=='O'){
                    board[i][j]='X';
                }else{
                    continue;
                }
            }
        }
    }
}