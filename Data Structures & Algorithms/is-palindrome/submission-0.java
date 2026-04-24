class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        List<Character> ch = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(c)) {
            ch.add(c);
    }
        }
        
        for (int i = 0; i < ch.size() / 2; i++) {
            if (ch.get(i) != ch.get(ch.size() - i - 1)) return false;
        }
        return true;
    }
}
