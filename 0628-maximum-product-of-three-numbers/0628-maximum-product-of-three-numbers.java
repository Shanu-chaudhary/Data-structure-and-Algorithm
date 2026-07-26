class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fn = Integer.MAX_VALUE;
        int sc = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] < 0){
                if(nums[i] <= fn){
                    sc = fn;
                    fn = nums[i];
                }else if(nums[i] <= sc){
                    sc = nums[i];
                }
            }
            if(nums[i] >= first){
                third  = sec;
                sec = first;
                first = nums[i];
            }else if(nums[i] >= sec){
                third = sec;
                sec = nums[i];
            }else if(nums[i] >= third){
                third = nums[i];
            }
        }
        if(fn != Integer.MAX_VALUE && sc != Integer.MAX_VALUE){
            return Math.max((first*sec*third), (fn*sc*first));
        }else {
            return first*sec*third;
        }
    }
}