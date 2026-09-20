class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int l = s.length();
        for(int i=0; i<l; i++){
            int rev = 26 - (s.charAt(i) - 'a');
            int prd = (i+1) * rev;
            sum += prd;
        }
        return sum;
    }
}