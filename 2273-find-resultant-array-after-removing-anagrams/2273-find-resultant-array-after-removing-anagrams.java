class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        String prev = "";
        for(int i=0; i<words.length; i++){
            char[] arr = words[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(i > 0 && !prev.equals(sorted)){
                ans.add(words[i]);
            }
            prev = sorted;
        }
        return ans;
    }
}