class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(-1);
        int max_len = 0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='(') {
                dq.push(i);
            } else {
                dq.pop();
                if (dq.isEmpty()) {
                    dq.push(i);
                } else {
                    max_len = Math.max(max_len, i-dq.peek());
                }
            }
        }

        return max_len;
    }
}