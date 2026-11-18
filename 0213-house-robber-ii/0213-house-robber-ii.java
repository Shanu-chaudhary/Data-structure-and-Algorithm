class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = count(0, nums, dp, n-2);
        int[] dpp = new int[n+1];
        Arrays.fill(dpp, -1);
        int anss = count(1, nums, dpp, n-1);
        return Math.max(ans, anss);
    }
    private int count(int n, int[] nums, int[] dp, int l){
        if(n > l){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int take = nums[n] + count(n+2, nums, dp, l);
        int skip = count(n+1, nums, dp, l);
        dp[n] = Math.max(take, skip);
        return dp[n];
    }
}