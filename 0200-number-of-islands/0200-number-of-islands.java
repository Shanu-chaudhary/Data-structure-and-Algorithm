import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        // Directions: up, down, left, right
        int[][] dirs = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // If land found
                if (grid[i][j] == '1') {

                    count++;

                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});

                    // Mark visited
                    grid[i][j] = '0';

                    // BFS
                    while (!q.isEmpty()) {

                        int[] curr = q.poll();

                        int r = curr[0];
                        int c = curr[1];

                        for (int[] d : dirs) {

                            int nr = r + d[0];
                            int nc = c + d[1];

                            // Boundary check + land check
                            if (nr >= 0 && nr < rows &&
                                nc >= 0 && nc < cols &&
                                grid[nr][nc] == '1') {

                                q.offer(new int[]{nr, nc});

                                // Mark visited
                                grid[nr][nc] = '0';
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}