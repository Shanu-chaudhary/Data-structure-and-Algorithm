class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = dSum(n);
        }

        return n == 1;
    }
    private int dSum(int num){
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + (rem*rem);
        }
        return sum;
    }
}