class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, ArrayList<String>> grups = new HashMap<>();

       for (int i = 0; i < strs.length; i++) {
            String cur = strs[i];
            char[] chaAr = cur.toCharArray();
            Arrays.sort(chaAr);
            String sortedStr = new String(chaAr);
            if (!grups.containsKey(sortedStr)) {
                grups.put(sortedStr, new ArrayList<String>());
            }
            grups.get(sortedStr).add(String.valueOf(cur));
       }
       return new ArrayList<>(grups.values());
    }
}
