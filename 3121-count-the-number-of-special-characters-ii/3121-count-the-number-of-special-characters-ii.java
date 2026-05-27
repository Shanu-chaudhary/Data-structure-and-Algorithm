class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> lower = new HashMap<>();
        HashMap<Character, Integer> upper = new HashMap<>();

        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)) {
                lower.put(ch, i);
            }
            else {
                if(upper.containsKey(Character.toLowerCase(ch))){
                    continue;
                }
                upper.put(Character.toLowerCase(ch), i);
            }
        }
        int count = 0;
        for(char ch : lower.keySet()){
            // char ch = word.charAt(i);
            if(upper.containsKey(ch) && lower.get(ch) < upper.get(ch)){
                count++;
            }
        }
        return count;
    }
}