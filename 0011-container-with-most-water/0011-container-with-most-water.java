class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int start = 0;
        int last = n-1;
        while(start < last){
            int min = Math.min(height[start], height[last]);
            int area = min * (last - start);
            maxArea = Math.max(maxArea, area);
            if(height[start] < height[last]){
                start++;
            }else {
                last--;
            }
        }
        return maxArea;
    }
}