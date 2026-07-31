class Solution {
    public String shortestPalindrome(String s) {
        int length = s.length();
        // if(length == 0){
        //     return
        // }
        String rev = new StringBuilder(s).reverse().toString();
        for(int i=0; i<length; i++){
            if(s.substring(0, length-i).equals(rev.substring(i))){
                return rev.substring(0, i) + s;
            }
        }
        return "";
    }
}