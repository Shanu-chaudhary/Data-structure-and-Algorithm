// class Solution {
//     public int minAddToMakeValid(String s) {
//         Stack<Character> st = new Stack<>();
//         int n = s.length();
//         int ans = 0;
//         for(int i=0; i<n; i++){
//             char ch = s.charAt(i);
//             if(ch == '('){
//                 ans++;
//                 st.push(ch);
//             }else {
//                 if(st.isEmpty()){
//                     ans++;
//                 }else {
//                     ans--;
//                     st.pop();
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }

        return ans + open;
    }
}