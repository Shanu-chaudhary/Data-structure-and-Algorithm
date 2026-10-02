class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int sumGas = 0;
        for(int g : gas){
            sumGas += g;
        }

        int sumCost = 0;
        for(int c : cost){
            sumCost += c;
        }

        if(sumGas < sumCost){
            return -1;
        }

        int total = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                result = i+1;
            }
        }
        return result;
    }
}