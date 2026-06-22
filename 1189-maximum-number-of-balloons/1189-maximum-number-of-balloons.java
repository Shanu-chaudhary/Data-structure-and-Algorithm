class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(char ch: text.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }
        int i=0;
        while(mpp.containsKey('b') && mpp.containsKey('a') && mpp.containsKey('l') && mpp.containsKey('o') && mpp.containsKey('n')){
            if(mpp.get('b')>0){
                mpp.put('b', mpp.get('b')-1);
            }else {
                break;
            }
            if(mpp.get('a')>0){
                mpp.put('a', mpp.get('a')-1);
            }else {
                break;
            }
            if(mpp.get('l')>1){
                mpp.put('l', mpp.get('l')-2);
            }else {
                break;
            }
            if(mpp.get('o')>1){
                mpp.put('o', mpp.get('o')-2);
            }else {
                break;
            }
            if(mpp.get('n')>0){
                mpp.put('n', mpp.get('n')-1);
            }else {
                break;
            }
            i++;
        }
        return i;
    }
}