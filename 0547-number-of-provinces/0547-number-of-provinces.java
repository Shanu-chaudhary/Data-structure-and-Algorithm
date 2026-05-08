class Solution {
    private void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adjLs){
        vis[node] = 1;
        for(Integer it : adjLs.get(node)){
            if(vis[it] == 0){
                dfs(it, vis, adjLs);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for(int i=0; i<v; i++){
            adjLs.add(new ArrayList<>());
        }
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                if(isConnected[i][j] == 1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int[] vis = new int[v];
        int cnt = 0;
        for(int i=0; i<v; i++){
            if(vis[i] == 0){
                cnt++;
                dfs(i, vis, adjLs);
            }
        }
        return cnt;
    }
}