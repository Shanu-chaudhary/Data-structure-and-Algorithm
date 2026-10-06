class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                ans++;
                st.push(ch);
            }else {
                if(st.isEmpty()){
                    ans++;
                }else {
                    ans--;
                    st.pop();
                }
            }
        }
        return ans;
    }
}