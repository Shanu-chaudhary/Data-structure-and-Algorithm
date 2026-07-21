class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int activeCount = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                activeCount++;
            }
        }
        ArrayList<Integer> pair = new ArrayList<>();
        int k = 0;
        while(k<n){
            if(s.charAt(k) == '0'){
                int start = k;
                while(k<n && s.charAt(k) == '0'){
                    k++;
                }
                pair.add(k-start);
            }else {
                k++;
            }
        }
        int maxPairSum = 0;
        for(int i=1; i<pair.size(); i++){
            maxPairSum = Math.max(maxPairSum, pair.get(i)+pair.get(i-1));
        }
        return maxPairSum + activeCount;
    }
}