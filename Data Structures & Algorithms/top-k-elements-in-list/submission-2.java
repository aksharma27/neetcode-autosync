class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            fr.put(nums[i], fr.getOrDefault(nums[i], 0)  + 1);
        }

        int[] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> fr.get(b) - fr.get(a));
        for (int num : fr.keySet()) {
            pq.offer(num);
        }
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}