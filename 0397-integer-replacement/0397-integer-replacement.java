class Solution {
    public int integerReplacement(int n) {
        long x = n;
        int ans = 0;
        while(x > 1){
            if((x&1)==0){
                x /= 2;
            }else if((x==3) || ((x&3) == 1)){
                x -= 1;
            }else {
                x += 1;
            }
            ans++;
        }
        return ans;
    }
}