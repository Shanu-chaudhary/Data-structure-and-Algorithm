// class Solution {
//     public int myAtoi(String s) {
//         int i=0;
//         while(i<s.length() && s.charAt(i) == ' '){
//             i++;
//         }
//         StringBuilder sb = new StringBuilder();
//         // int sign = 0;
//         if(s.charAt(i) == '-'){
//                 sb.append('-');
//                 i++;
//         }
//         for(int j=i; j<s.length(); j++){
            
//             if(s.charAt(j) >= '0' && s.charAt(j) <= '9'){
//                 sb.append(s.charAt(j));
//             }else {
//                 break;
//             }
            
//         }
//         String a = sb.toString();
//         int ans;
//         if(a.length() == 0){
//             return 0;
//         }else {
//             ans = Long.parseLong(a);
//         }
//         if(ans > Integer.MAX_VALUE){
//             ans = Integer.MAX_VALUE;
//         }else if (ans < Integer.MIN_VALUE){
//             ans = Integer.MIN_VALUE;
//         }
//         return ans;
//     }
// }



class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        int ans = 0;

        // Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Overflow check
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return ans * sign;
    }
}