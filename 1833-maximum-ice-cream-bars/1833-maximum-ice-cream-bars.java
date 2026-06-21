class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
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