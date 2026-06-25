class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        int currSum = 0;

        mp.put(0, 1);
        long ValidLeftPoints = 0;
        long result = 0;

        for(int x : nums){
            if(x == target){
                ValidLeftPoints += mp.getOrDefault(currSum, 0);
                currSum++;
            }else {
                currSum--;
                ValidLeftPoints -= mp.getOrDefault(currSum, 0);
            }
            mp.merge(currSum, 1, Integer::sum);
            result += ValidLeftPoints;
        }
        return result;
    }
}