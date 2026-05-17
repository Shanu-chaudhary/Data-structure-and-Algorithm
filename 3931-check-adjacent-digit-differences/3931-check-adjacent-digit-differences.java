class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();
        for(int i=1; i<n; i++){
            char ch = s.charAt(i);
            int a = ch - '0';
            int b = s.charAt(i-1)-'0';
            int diff = Math.abs(a - b);
            if(diff > 2){
                return false;
            }
        }
        return true;

    }
}