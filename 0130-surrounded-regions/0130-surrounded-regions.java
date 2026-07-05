class Solution {
    private boolean isEdge(int i, int j, int row, int col){
        if(i+1<row && i-1>=0 && j+1<col && j-1>=0){
            return false;
        }
        return true;
    }
    private void dfs(int r, int c, int row, int col, int[][] vis, char[][] board){
        vis[r][c] = 1;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0, -1};
        for(int i=0; i<4; i++){
            int nrow = r + drow[i];
            int ncol = c + dcol[i];
            if(nrow >=0 && nrow < row && ncol>=0 && ncol < col && board[nrow][ncol] == 'O' && vis[nrow][ncol] == 0){
                dfs(nrow, ncol, row, col, vis, board);
            }
        }
    }
    public void solve(char[][] board) {
        int row = board.length; 
        int col = board[0].length;
        int[][] vis = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if((board[i][j] == 'O') && (isEdge(i, j, row, col))){
                    // vis[i][j] = 1; // matlab iss position pr O fix hai
                    if(vis[i][j] == 0){
                        dfs(i, j, row, col, vis, board);
                    }
    
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(vis[i][j] == 1){
                    board[i][j] = 'O';
                }else {
                    board[i][j] = 'X';
                }
            }
        }
    }
}