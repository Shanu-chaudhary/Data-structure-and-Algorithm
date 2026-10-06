class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int lastPoint = points[0][1];
        int ans = 1;
        for(int i=0; i<points.length; i++){
            if(lastPoint >= points[i][0]){
                continue;
            }
            ans++;
            lastPoint = points[i][1];
        }
        return ans;
    }
}