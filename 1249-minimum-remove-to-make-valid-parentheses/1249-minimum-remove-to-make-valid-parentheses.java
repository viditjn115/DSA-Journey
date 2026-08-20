class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==')'){
                if(!dq.isEmpty()){
                    sb.insert(dq.pop() , "(");
                }
                else{
                    continue;
                }   
            }
            if(s.charAt(i)=='('){
                dq.push(sb.length());
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}