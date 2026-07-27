class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else 
            {
                if (st.isEmpty()) return false;
                if ((c == ')' && st.peek() == '(') || 
                    (c == '}' && st.peek() == '{') || 
                    (c == ']' && st.peek() == '[')) {
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
}
