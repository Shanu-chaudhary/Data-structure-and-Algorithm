class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        mpp.put('I', 1);
        mpp.put('V', 5);
        mpp.put('X', 10);
        mpp.put('L', 50);
        mpp.put('C', 100);
        mpp.put('D', 500);
        mpp.put('M', 1000);
        int n = s.length();
        int ans = 0;
        int i=0;
        while(i<n){
            char c = s.charAt(i);
            int num = mpp.get(c);
            if(c == 'I'){
                if(i<n-1 && s.charAt(i+1) == 'V'){
                    num = 4;
                    i = i + 2;
                }else if(i<n-1 && s.charAt(i+1) == 'X'){
                    num = 9;
                    i = i + 2;
                }
                else i++;
            } else if(c == 'X'){
                if(i<n-1 && s.charAt(i+1) == 'L'){
                    num = 40;
                    i = i + 2;
                }else if(i<n-1 && s.charAt(i+1) == 'C'){
                    num = 90;
                    i = i + 2;
                }
                else i++;
            }else if(c == 'C'){
                if(i<n-1 && s.charAt(i+1) == 'D'){
                    num = 400;
                    i = i + 2;
                }else if(i<n-1 && s.charAt(i+1) == 'M'){
                    num = 900;
                    i = i + 2;
                }
                else i++;
            }else {
                i++;
            }
            
            ans = ans + num;
        }
        return ans;
    }
}