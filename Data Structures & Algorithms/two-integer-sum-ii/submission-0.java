class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        int n = numbers.length;
        while (true) {
            int sum = numbers[low] + numbers[high];
            if (sum > target) {
                high--;
            }
            else if (sum < target) {
                low++;
            }
            else if (sum == target){
                return new int[]{low + 1, high + 1};
            }
            else break;
        }
        return new int[]{-1, -1};
    }
}      