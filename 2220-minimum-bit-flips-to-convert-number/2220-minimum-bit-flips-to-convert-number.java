class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal; // it will  the no. of different bits to 1
        // now just count the no. of set bits
        int cnt = 0;
        while(ans != 0){
            ans = ans & (ans-1);
            cnt++;
        }
        return cnt;
    }
}