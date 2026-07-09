class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int[] component = new int[n];
        int comp = 0;
        component[0] = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] - nums[i-1] > maxDiff){
                comp++;
            }
            component[i] = comp;
        }
        boolean[] ans = new boolean[queries.length];
        for(int i=0; i<queries.length; i++){
            if(component[queries[i][0]] == component[queries[i][1]]){
                ans[i] = true;
            }
        }
        return ans;

        // ArrayList<ArrayList<Integer>> gp = new ArrayList<>();
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     mpp.put(nums[i], i);
        //     gp.add(new ArrayList<>());
        // }

        // // Build graph
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<=maxDiff; j++){
        //         int sum = nums[i] + j;
        //         if(mpp.containsKey(sum)){
        //             gp.get(i).add(mpp.get(sum));
        //         }
        //     }
        // }

        // boolean[] ans = new boolean[queries.length];
        // for(int i=0; i<queries.length; i++){
        //     int first = queries[i][0];
        //     int second = queries[i][1];
        //     ArrayList<Integer> arr = gp.get(first);
        //     for(int it : arr){
        //         if(it == second){
        //             ans[i] = true;
        //             break;
        //         }
        //         // ans[i]= false;
        //     }
        //     if (ans[i] == false) {
        //         boolean[] vis = new boolean[nums.length];
        //         ans[i] = dfs(first, second, gp, vis);
        //     }
            
        // }
        // return ans;
    // }
    // public boolean dfs(int node, int target, ArrayList<ArrayList<Integer>> gp, boolean[] vis) {
    //     if (node == target) {
    //         return true;
    //     }

    //     vis[node] = true;

    //     for (int nei : gp.get(node)) {
    //         if (!vis[nei]) {
    //             if (dfs(nei, target, gp, vis)) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    }
}