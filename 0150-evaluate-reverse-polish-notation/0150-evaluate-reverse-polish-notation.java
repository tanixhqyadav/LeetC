class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < t.length; i++) {
            String token = t[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = st.pop(), a = st.pop();
                if (token.equals("+")) st.push(a + b);
                else if (token.equals("-")) st.push(a - b);
                else if (token.equals("*")) st.push(a * b);
                else st.push(a / b);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
