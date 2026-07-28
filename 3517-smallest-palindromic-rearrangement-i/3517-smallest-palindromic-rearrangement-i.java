class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        char[] ans = new char[n];
        int k = 0;
        for(int i=0; i<26; i++){
            char ch = (char) ('a' + i);
            while(arr[i] >= 2){
                ans[k] = ch;
                ans[n-1-k] = ch;
                k++;
                arr[i] -= 2;
            }
        }
        for(int i=0; i<26; i++){
            if(arr[i] == 1){
                char ch = (char) ('a' + i);
                ans[k] = ch;
                break;
            }
        }
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<n; i++){
        //     sb.append(ans[i]);
        // }
        return new String(ans);
    }
}