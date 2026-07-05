class Solution {
    public int numEnclaves(int[][] grid) {
        int row = grid.length; 
        int col = grid[0].length; 
        int[][] vis = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if((grid[i][j] == 1) && (isEdge(i, j, row, col))){
                    if(vis[i][j] == 0){
                        dfs(i, j, row, col, vis, grid);
                    }

                }
            }
        }
        int ans = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1 && vis[i][j] == 0){
                    ans++;
                }
            }
        }
        return ans;
    }
    private void dfs(int r, int c, int row, int col, int[][] vis, int[][] grid){
        vis[r][c] = 1;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0, -1};
        for(int i=0; i<4; i++){
            int nrow = r + drow[i];
            int ncol = c + dcol[i];
            if(nrow >=0 && nrow < row && ncol>=0 && ncol < col && grid[nrow][ncol] == 1 && vis[nrow][ncol] == 0){
                dfs(nrow, ncol, row, col, vis, grid);
            }
        }
    }
    private boolean isEdge(int i, int j, int row, int col){
        return i == 0 || j == 0 || i == row - 1 || j == col - 1;
    }
}