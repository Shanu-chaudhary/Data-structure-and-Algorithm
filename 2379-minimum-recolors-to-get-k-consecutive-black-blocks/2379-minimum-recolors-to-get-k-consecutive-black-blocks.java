class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int i = 0;
        int j = 0;
        int black  = 0;
        int m = 0;
        while(i < n && j < n){
            if(blocks.charAt(j) == 'B'){
                black++;
            }
            if(black == k){
                return 0;
            }
            int len = j-i+1;
            if(len < k){
                j++;
            }else {
                m = Math.max(m, black);
                if(blocks.charAt(i) == 'B'){
                    black--;
                }
                i++;
                j++;
            }
        }
        return k - m;
    }
}