class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(String words : patterns){
            if(word.contains(words)){
                ans++;
            }
        }
        return ans;
    }
}