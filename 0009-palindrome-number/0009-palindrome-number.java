class Solution {
    public boolean isPalindrome(int x) {
        int temp =x;
        int num = 0;
        while(x>0){
            int rem = x % 10;
            x /= 10;
            num = (num*10) + rem;
        }
        if(num == temp){
            return true;
        }else {
            return false;
        }
    }
}