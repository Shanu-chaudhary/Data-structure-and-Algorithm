class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = count(0, nums, dp);
        return ans;
    }
    private int count(int n, int[] nums, int[] dp){
        if(n >= nums.length){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int take = nums[n] + count(n+2, nums, dp);
        int skip = count(n+1, nums, dp);
        dp[n] = Math.max(take, skip);
        return dp[n];
    }
}