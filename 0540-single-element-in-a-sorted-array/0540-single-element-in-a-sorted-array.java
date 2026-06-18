class Solution {
    public int singleNonDuplicate(int[] nums) {
        // using xor operator but gives O(logN)
        int result = 0;
        for(int num : nums){
            result = result ^ num;
        }
        return result;
    }
}