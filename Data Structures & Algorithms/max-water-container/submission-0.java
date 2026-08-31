class Solution {
    public int maxArea(int[] heights) {
        int maxAmountOfWater = 0;
        int n = heights.length;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            int currentArea = (right - left) * Math.min(heights[right], heights[left]);
           maxAmountOfWater = Math.max(maxAmountOfWater, currentArea);
           if(heights[left] < heights[right]) {
            left++;
           } else if(heights[left] > heights[right]) {
            right--;
           } else {
            left++;
           }

        }

        return maxAmountOfWater;

        
        
    }
}
