class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Form a graph
        // create adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int m = prerequisites.length;
        for(int i=0; i<m; i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        // topoSort
        int[] indegree = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        int i = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo.add(node);
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        if(topo.size() == numCourses){
            return true;
        }
        return false;
    }
}