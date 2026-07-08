class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        if (nums.length == 0) return ans;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    ans.add(String.valueOf(start));
                } else {
                    ans.add(start + "->" + nums[i - 1]);
                }

                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return ans;






        // List<String> ans = new ArrayList<>();
        // if(nums.length  == 0){
        //     return ans;
        // }
        // if(nums.length == 1){
        //     StringBuilder st = new StringBuilder(nums[0]);
        //     ans.add(st.toString());
        //     return ans;
        // }
        // StringBuilder st = new StringBuilder();
        // st.append(nums[0]);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]+1){
        //         st.append(nums[i]);
        //     }else {
        //         char f = st.charAt(0);
        //         char l = st.charAt(st.length()-1);
                // String s = new String(f + "->" + l);
        //         String s = "";
        // if(f != l){
        //      s = new String(f + "->" + l);
        // }else {
        //      s = Character.toString(f);
        // }
        //         ans.add(s);
        //         st.setLength(0);
        //         st.append(nums[i]);
        //     }
        // }
        // char f = st.charAt(0);
        // char l = st.charAt(st.length()-1);
        // String s = "";
        // if(f != l){
        //      s = new String(f + "->" + l);
        // }else {
        //      s = Character.toString(f);
        // }
        // ans.add(s);
        // return ans;
    }
}