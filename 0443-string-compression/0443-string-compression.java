class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int n = chars.length;
        s.append(chars[0]);
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(chars[i] == chars[i-1]){
                cnt++;
            }else {
                if(cnt > 1){
                    s.append(cnt);
                }
                s.append(chars[i]);
                cnt = 1;
            }
        }
        if((n>1) && (chars[n-1] == chars[n-2])){
            s.append(cnt);
        }
        int len = s.length();
        int newlen = Math.min(len, n);
        for(int i=0; i<newlen; i++){
            chars[i] = s.charAt(i);
        }
        return len;
    }
}