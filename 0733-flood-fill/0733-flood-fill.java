class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int OriginalC = image[sr][sc];
        q.add(new Pair(sr, sc));
        vis[sr][sc] = color;
        image[sr][sc] = color;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, -1, 0, +1};
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for(int i=0; i<4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                 image[nrow][ncol] == OriginalC && vis[nrow][ncol]!=color){
                    q.add(new Pair(nrow, ncol));
                    vis[nrow][ncol] = color;
                    image[nrow][ncol] = color;
                 }
            }
        }
        return image;
    }
}