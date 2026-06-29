class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int slow = n;
        int fast = n;
        do {
            slow = dSum(slow);
            fast = dSum(dSum(fast));
        } while(slow != fast);

        return slow == 1;
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