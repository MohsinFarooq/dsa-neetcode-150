class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLeft = 0, maxRight = 0, totalWater = 0;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            if(height[left] < height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                totalWater += maxLeft - height[left];
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right]);
                totalWater += maxRight - height[right];
                right--;
            }
        }
        return totalWater;
        
    }
}
