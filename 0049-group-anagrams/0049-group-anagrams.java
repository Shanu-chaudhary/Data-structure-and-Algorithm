class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mpp = new HashMap<>();

        for(String st : strs){
            int[] count = new int[26];
            for(char ch : st.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
                while(count[i] > 0){
                    sb.append((char) 'a'+i);
                    count[i]--;
                }
            }
            String key = sb.toString();
            if(!mpp.containsKey(key)){
                mpp.put(key, new ArrayList<>());
            }
            mpp.get(key).add(st);
        }
        return new ArrayList<>(mpp.values());
    }
}