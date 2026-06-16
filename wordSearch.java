class Solution {
    public static boolean dfs(char[][] board, String word, boolean[][] visited, int i, int j, int current){
        if(current==word.length())return true;
        if(j>=board[0].length ||i>=board.length ||j<0 || i<0)return false;
        if(visited[i][j])return false;
        if(board[i][j]!=word.charAt(current))return false;
        visited[i][j] = true;
        boolean found = dfs(board,word,visited,i-1,j,current+1) || dfs(board,word,visited,i,j-1,current+1) || dfs(board,word,visited,i+1,j,current+1) || dfs(board,word,visited,i,j+1,current+1);
        visited[i][j] = false;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,visited,i,j,0))return true;
            }
        }
        return false;
    }
}
