class Solution {
    public long gcdSum(int[] nums) {
        int [] prefixGcd  = new int[nums.length];
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            int n = gcd(nums[i], max);
            prefixGcd[i] = n;
        }
        Arrays.sort(prefixGcd);
        int i=0, j=prefixGcd.length-1;
        long sum = 0;
        while(i < j){
            int n = gcd(prefixGcd[i], prefixGcd[j]);
            sum += n;
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}