class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(l==1){
            if(flowerbed[0] == 0){
                flowerbed[0] = 1;
                n--;
                return n<=0;
            }else {
                if(n==0){
                    return true;
                }else {
                    return false;
                }
            }
        }
        for(int i=0; i<l; i++){
            
            if(i==0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
            }
            if(i==l-1 && flowerbed[i-1] == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
            }
            if(i>0 && i<l-1 && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1]==0){
                flowerbed[i] = 1;
                n--;
            }
        }
        if(n<=0){
            return true;
        }else {
            return false;
        }
    }
}