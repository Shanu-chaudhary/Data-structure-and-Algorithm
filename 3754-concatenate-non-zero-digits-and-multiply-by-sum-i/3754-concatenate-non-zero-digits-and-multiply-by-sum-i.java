class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            long rem = n % 10;
            if(rem > 0){
                sb.append(rem);
            }
            n /= 10;
        }
        if(sb.length() == 0){
            return 0;
        }
        String st = sb.reverse().toString();
        long a = Integer.parseInt(st);
        long x = a;
        long sum  = 0;
        while(x>0){
            long rem = x % 10;
            sum += rem;
            x /= 10;
        }
        long ans = sum * a;
        return ans;
    }
}