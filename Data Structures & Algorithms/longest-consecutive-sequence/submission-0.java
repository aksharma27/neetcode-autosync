class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;        
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int longest = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    longest++;
                }
                max = Math.max(longest, max);
            }
        }
        return max;
    }
}
