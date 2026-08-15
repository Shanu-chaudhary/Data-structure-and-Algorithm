class Solution {
    public int trailingZeroes(int n) {

        int ans = 0;
        while(n >= 5){
            ans += n/5;
            n /= 5;
        }
        return ans;
    //     int fact = help(n);
    //     String st = String.valueOf(fact);
    //     int ans = 0;
    //     int i= st.length()-1;
    //     while(st.charAt(i) == '0'){
    //         ans++;
    //         i--;
    //     }
    //     return ans;
    }
    // public int help(int n){
    //     if(n == 0 || n==1){
    //         return 1;
    //     }
    //     return n * help(n-1);
    // }
}