class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for(int i=0; i<costs.length; i++){
            if(costs[i] > max){
                max = costs[i];
            }
        }
        int[] freq = new int[max+1];
        for(int i=0; i<costs.length; i++){
            freq[costs[i]]++;
        }
        int k = 0;
for(int i = 0; i < freq.length; i++) {
    for(int j = 0; j < freq[i]; j++) {
        costs[k++] = i;
    }
}
        if(coins < costs[0]){
            return 0;
        }
        int cnt = 0;
        for(int i=0; i<costs.length; i++){
            coins -= costs[i];
            if(coins >= 0){
                cnt++;
            }else {
                break;
            }
        }
        return cnt;
    }
}