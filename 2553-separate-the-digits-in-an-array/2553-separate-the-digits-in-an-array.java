class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            int digit = nums[i];
            String s = String.valueOf(digit);
            for(int j=0; j<s.length(); j++){
                int c = s.charAt(j) - '0';
                ans.add(c);
            }
        }
        int[] intArray = ans.stream().mapToInt(i -> i).toArray();
        return intArray;
    }
}