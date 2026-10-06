class Solution {
    public List<Integer> partitionLabels(String s) {
        int l = s.length();
        List<Integer> ans = new ArrayList<>();
        int[] lastI = new int[26];
        for(int i=0; i<l; i++){
            lastI[s.charAt(i) - 'a'] = i;
        }

        int i=0, j=0, end = 0;
        while(i < l){
            if(lastI[s.charAt(j) - 'a'] > end){
                end = lastI[s.charAt(j) - 'a'];
            }
            if(j == end){
                ans.add(j-i+1);
                i = j+1;
            }
            j++;
        }
        return ans;
    }
}