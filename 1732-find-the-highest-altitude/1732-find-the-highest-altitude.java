class Solution {
    public int largestAltitude(int[] gain) {
        int ans = Integer.MIN_VALUE;
        int alti = 0;
        for(int i=0; i<gain.length; i++){
            alti = alti + gain[i];
            ans = Math.max(ans,Math.max(alti, 0));
            
        }
        return ans;
    }
}