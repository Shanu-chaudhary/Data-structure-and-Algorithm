class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0; i<32; i++){
            ans = ans << 1;
            ans = ans | (n&1);
            n>>>=1;   // unsigned right shift operator for -ve numbers
        }
        return ans;

        // StringBuilder sb = new StringBuilder();
        // while(n>0){
        //     int rem = n % 2;
        //     sb.append(rem);
        //     n = n/2;
        // }
        // sb.reverse();
//         StringBuilder sb = new StringBuilder();

// for (int i = 0; i < 32; i++) {
//     sb.append(n & 1);
//     n >>>= 1;
// }
//         int ans = 0;
//         int p2 = 1;
//         for(int i=sb.length()-1; i>=0; i--){
//             char ch = sb.charAt(i);
//             int num = ch - '0';
//             ans = ans + (p2 * num);
//             p2 = p2 * 2;
//         }
//         return ans;
    }
}