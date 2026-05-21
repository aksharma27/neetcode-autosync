class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length(), len = -1, maxFr = 0;
        int left = 0;
        Map<Character, Integer> fr = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char cur  = s.charAt(right);
            fr.put(cur, fr.getOrDefault(cur, 0) + 1);
            maxFr = Math.max(maxFr, fr.get(cur));

            while((right - left + 1) - maxFr > k) {
                char startChar = s.charAt(left);
                fr.put(startChar, fr.get(startChar) - 1);
                left++;
            }
            len = Math.max(len, right - left + 1);
        }
        return len;
    }
}