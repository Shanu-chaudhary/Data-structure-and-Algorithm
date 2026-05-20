class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            while(j<t.length() && ch != t.charAt(j)){
                j++;
            }
            if(j==t.length()){
                return false;
            }
            i++;
            j++;
            
        }
        return true;
    }
}