class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        HashMap<Character, String> mpp = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(mpp.containsKey(ch)){
                String st = mpp.get(ch);
                if(!st.equals(arr[i])){
                    return false;
                }
            }else {
                if(!mpp.containsValue(arr[i])){
                    mpp.put(ch, arr[i]);
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}