class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        ArrayList<Character> st = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                st.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                sb.append(st.get(j));
                j++;
            }else {
                sb.append(s.charAt(i));
            }
        }
        String ans = sb.toString();
        return ans;
    }
}