class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            arr[ch - 'a']++;
        }
        Arrays.sort(arr);
        int[] freq = new int[26];
        for(int i=0; i<26; i++){
            freq[i] = arr[25-i];
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            if(freq[i] == 0){
                break;
            }
            ans += ((i/8)+1)*freq[i];
        }
        return ans;
    }
}