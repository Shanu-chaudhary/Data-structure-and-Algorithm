class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {

            // smallest element
            if (num <= first) {
                first = num;
            }

            // second smallest element
            else if (num <= second) {
                second = num;
            }

            // found third element
            else {
                return true;
            }
        }

        return false;
    }
}