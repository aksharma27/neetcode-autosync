class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int max = 0;
        while (i < j) {
            max = Math.max ((j - i) * Math.min(heights[i], heights[j]), max);
            if (heights[i] < heights[j]) 
            {
                i++;
            }
            else if (heights[j] < heights[i]) {
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        return max;
    }
}