class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // sort hashMap in desc order by their freq
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int ans = 0;
        int idx = 0;
        for(Map.Entry<Character, Integer> entry : sortedMap.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            ans += ((idx/8)+1)*freq;
            idx++;
        }
        return ans;

    }
}