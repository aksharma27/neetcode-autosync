class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for (String s : strs) {
            sb.append(s.length()).append("/").append(s);
        }
        return sb.toString();
    }
    
    // DECODE: Read length → read that many chars
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find "/" after length
            int slash = str.indexOf('/', i);
            int length = Integer.parseInt(str.substring(i, slash));
            
            // Read exactly 'length' chars after "/"
            String word = str.substring(slash + 1, slash + 1 + length);
            result.add(word);
            
            // Move to next
            i = slash + 1 + length;
        }
        return result;
    }
}
