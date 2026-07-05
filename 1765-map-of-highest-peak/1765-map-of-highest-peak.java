class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int row = isWater.length;
        int col = isWater[0].length;
        int[][] ans = new int[row][col];
        int[][] vis = new int[row][col];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(isWater[i][j] == 1){
                    q.add(new int[]{i, j, 0});
                    vis[i][j] = 1;
                }
            }
        }
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0 , -1};
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            int height = cell[2];
            ans[r][c] = height;
            for(int i=0; i<4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<row && ncol>=0 && ncol<col && vis[nrow][ncol] == 0 && isWater[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    q.add(new int[]{nrow, ncol, height+1});
                }
            }
        }
        return ans;
    }
}