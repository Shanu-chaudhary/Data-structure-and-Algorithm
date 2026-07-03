class Solution {
    public int singleNumber(int[] nums) {

        // most optimised

        // int ones = 0;
        // int twos = 0;
        // for(int i=0; i<nums.length; i++){
        //     ones = ((ones^nums[i]) & (~twos));
        //     twos = ((twos^nums[i]) & (~ones));
        // }
        // return ones;

        // nlogn + n
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i+=3){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}