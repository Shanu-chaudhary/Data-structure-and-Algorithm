class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 1 && (nums[0] == k)){
            return 1;
        }
        int ans = 0;
        int i=0, j=n-1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum < k){
                i++;
            }else if(sum > k){
                j--;
            }else {
                ans++;
                i++;
                j--;
            }
        }
        return ans;
    }
}