class Solution {
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int count =0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' ){
                    count++;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return count;
    }
    public void dfs(char grid[][],int i,int j,boolean[][] visited){

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i,j-1,visited);
    }
}