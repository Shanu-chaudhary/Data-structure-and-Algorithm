class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] rightsum = new int[n];
        int rsum = 0;
        for(int i=rightsum.length-1; i>=0; i--){
            rsum = rsum + nums[i];
            rightsum[i] = rsum;
        }
        int lsum = 0;
        for(int i=0; i<nums.length; i++){
            lsum = lsum + nums[i];
            if(lsum == rightsum[i]){
                return i;
            }
        }
        return -1;
    }
}