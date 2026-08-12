class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // int n = nums.length;
        // int j = 0;
        // int ans = 0;
        // while(j < n){
        //     HashMap<Integer, Integer> map = new HashMap<>();
        //     int len = 0;
        //     for(int i=j; i<n; i++){
        //         map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        //         if(map.get(nums[i]) <= k){
        //             len++;
        //             ans = Math.max(ans, len);
        //         }else {
        //             break;
        //         }
                
        //     }
        //     map.clear();
        //     j++;
        // }
        // return ans;

        int n = nums.length;
        Map<Integer, Integer> frequency = new HashMap();
        int start = 0;
        int charsWithFreqOverK = 0;
        
        for (int end = 0; end < n; end++) {
            frequency.put(nums[end], frequency.getOrDefault(nums[end], 0) + 1);
            if (frequency.get(nums[end]) == k + 1) { 
                charsWithFreqOverK++;
            }
            if (charsWithFreqOverK > 0) { 
                frequency.put(nums[start], frequency.get(nums[start]) - 1); 
                if (frequency.get(nums[start]) == k) { 
                    charsWithFreqOverK--; 
                }
                start++;
            }
        }
        return n - start;
    }
}