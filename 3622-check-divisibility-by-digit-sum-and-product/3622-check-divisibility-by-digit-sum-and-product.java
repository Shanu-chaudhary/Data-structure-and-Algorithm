class Solution {
    public boolean checkDivisibility(int n) {
        int sum = sumOfD(n);
        int pro = proD(n);
        int val = sum + pro;
        if(n % val == 0){
            return true;
        }
        return false;
    }
    private int sumOfD(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    private int proD(int n){
        int pro = 1;
        while(n>0){
            pro = pro * (n%10);
            n /= 10;
        }
        return pro;
    }
}