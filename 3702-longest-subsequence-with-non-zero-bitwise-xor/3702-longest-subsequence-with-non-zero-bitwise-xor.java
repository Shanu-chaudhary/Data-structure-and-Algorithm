class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalxor = 0;
        boolean allzero = true;
        for(int num : nums){
            totalxor ^= num;
            if(num > 0){
                allzero = false;
            }
        }
        if(totalxor > 0){
            return n;
        }
        return allzero ? 0 : n-1;
    }
}