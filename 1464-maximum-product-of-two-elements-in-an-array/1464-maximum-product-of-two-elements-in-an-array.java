class Solution {
    public int maxProduct(int[] nums) {
        int f = 0;
        int s =1;
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i] >= nums[f]){
                s = f;
                f = i;
            }else if(nums[i] >= nums[s]){
                s = i;
            }
        }
        return ((nums[f]-1)*(nums[s]-1));
    }
}