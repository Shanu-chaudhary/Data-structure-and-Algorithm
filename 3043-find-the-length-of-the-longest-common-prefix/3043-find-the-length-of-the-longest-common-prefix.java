class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        HashSet<String> set = new HashSet<>();
        for(int num : arr1){
            String s = String.valueOf(num);
            int len = s.length();
            int i = 1;
            while(i<=len){
                set.add(s.substring(0, i));
                i++;
            }
        }
        int ans = 0;
        for(int num : arr2){
            String s = String.valueOf(num);
            int len = s.length();
            int i = 1;
            while(i<=len){
                if(set.contains(s.substring(0,i))){
                    ans = Math.max(ans, i);
                }
                i++;
            }
        }
        return ans;
    }
    // public int help(String s1, String s2){
    //     int len = 0;
    //     int n = Math.min(s1.length(), s2.length());
    //     int i =0;
    //     int j = 0;
    //     while(i <n && j<n){
    //         if(s1.charAt(i) == s2.charAt(j)){
    //             i++;
    //             j++;
    //             len++;
    //         }else {
    //             break;
    //         }
    //     }
    //     return len;
    // }
}