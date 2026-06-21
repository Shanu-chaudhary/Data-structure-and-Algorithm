class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt = 0;
        for(int i=0; i<costs.length; i++){
            if( i == 0 && coins < costs[i]){
                return 0;
            }
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