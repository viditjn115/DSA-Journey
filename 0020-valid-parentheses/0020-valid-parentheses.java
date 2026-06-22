class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                else{
                    char top= st.pop();
                    if(s.charAt(i)==')' && top!='(' || s.charAt(i)=='}' && top!='{' || s.charAt(i)==']' && top!='[' ){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}