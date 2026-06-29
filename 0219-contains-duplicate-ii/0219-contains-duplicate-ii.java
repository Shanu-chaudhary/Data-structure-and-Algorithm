class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i], i);
            }else {
                int index = mpp.get(nums[i]);
                if(Math.abs(index - i) <= k){
                    return true;
                }else {
                    mpp.put(nums[i], i);
                }
            }
        }
        return false;
    }
}