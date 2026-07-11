class Solution {
    int count;
    int edge;
    public int countCompleteComponents(int n, int[][] edges) {
        // number of edges and degree count karne ke liye global variable banana hoga;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int ans = 0;
        int[] vis = new int[n];
        for(int i=0; i<n; i++){
            if(vis[i] == 0){
                count = 0;
                edge = 0;
                dfs(i, vis, adj);
                edge = edge / 2;  // har edge do bar count ho rha hai isliye
                if(edge == (count * (count - 1)) / 2){
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        count++;
        edge = edge +  adj.get(node).size();  // no. of degree
        for(int it : adj.get(node)){
            if(vis[it] == 0){
                dfs(it, vis, adj);
            }
        }
    }
}