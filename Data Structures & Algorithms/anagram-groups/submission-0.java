class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

       int n = strs.length;
       for (int i = 0; i < n; i++) {
         String cur = strs[i];
         char[] ch = cur.toCharArray();
         Arrays.sort(ch);
         String sorted = new String(ch);

         if (!group.containsKey(sorted)) {
            group.put(sorted, new ArrayList<>());
         }

         group.get(sorted).add(String.valueOf(cur));
       }
       return new ArrayList<>(group.values());
    }
}
