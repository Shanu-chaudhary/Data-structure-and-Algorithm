class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (n == k) {
            int res = nums[0];
            for (int x : nums) {
                res = Math.max(res, x);
            }
            return res;
        }
        int[] count = new int[51];
        for (int x : nums) {
            count[x]++;
        }
        if (k == 1) {
            for (int i = 50; i >= 0; --i) {
                if (count[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
        int res = -1;
        if (count[nums[0]] == 1) {
            res = Math.max(res, nums[0]);
        }
        if (count[nums[n - 1]] == 1) {
            res = Math.max(res, nums[n - 1]);
        }
        return res;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int i=0;
        // int j=k-1;
        // while(i<j && j<n){
        //     for(int a=i; a<=j; a++){
        //         map.put(nums[a], map.getOrDefault(nums[a], 0)+1);
        //     }
        //     j++;
        //     i++;
        // }
        // int ans = -1;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() == 1){
        //         ans = Math.max(ans, entry.getKey());
        //     }
        // }
        // return ans;
    }
}