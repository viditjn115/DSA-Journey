class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n , n, "");
        return res;
    }
    public void backtrack(int open ,int  close ,String s){
        if(open>close){
            return;
        }
        if(open==0&&close==0){
            res.add(s);
            return;
        }
        if(open>0){
            backtrack(open-1,close,s+"(");
        }
        if(close>0){
            backtrack(open , close-1 , s+")");
        }
    }
}