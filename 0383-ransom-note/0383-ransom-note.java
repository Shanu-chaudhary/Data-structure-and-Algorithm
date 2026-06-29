class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            mpp.put(ransomNote.charAt(i), mpp.getOrDefault(ransomNote.charAt(i), 0)+1);
        }
        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(mpp.containsKey(ch)){
                int freq = mpp.get(ch)-1;
                if(freq == 0){
                    mpp.remove(ch);
                }else {
                    mpp.put(ch, freq);
                }
            }
        }
        return mpp.isEmpty();
    }
}