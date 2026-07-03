class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }
        int k = 0;
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            if(Objects.equals(entry.getValue(), 1)){
                ans[k] = entry.getKey();
                k++;
            }
        }
        return ans;
    }
}