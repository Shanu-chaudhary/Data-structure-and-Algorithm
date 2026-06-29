class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(char ch:ransomNote.toCharArray()){
            arr[ch - 'a']++;
        }
        for(char ch:magazine.toCharArray()){
            if(arr[ch-'a'] > 0){
                arr[ch-'a']--;
            }
        }
        for(int i=0; i<26; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}