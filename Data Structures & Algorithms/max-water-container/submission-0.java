class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int maxArea = 0;
        while (i < j) {
            maxArea = Math.max((j - i) * Math.min(heights[j], heights[i]), maxArea);
            if (heights[j] < heights[i]) {
                j--;
            }
            else if (heights[i] < heights[j]) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        return maxArea;
    }
}