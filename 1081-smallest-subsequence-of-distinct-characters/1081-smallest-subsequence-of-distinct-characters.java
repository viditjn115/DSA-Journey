class Solution {
    public String smallestSubsequence(String s) {
        int[] used = new int [26];
        for(int i =0;i<s.length();i++){
            used[s.charAt(i)-'a']++;
        }
        boolean [] inStack = new boolean [26];
        Deque <Character> dq = new ArrayDeque<>();
        StringBuilder res=new StringBuilder();
         for (int i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            used[ch-'a']--;
            if (inStack[ch-'a']) {
                continue;
            }
            while (!dq.isEmpty() && dq.peek()>ch && used[dq.peek()-'a']>0) {
                char removed = dq.pop();
                inStack[removed - 'a'] = false;
            }
            dq.push(ch);
            inStack[ch - 'a'] = true;
        }
        while(!dq.isEmpty()){
            res.append(dq.pop());
        }
        return res.reverse().toString();
    }
}