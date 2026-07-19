class Solution {
    public int longestValidParentheses(String s) {
        int left =0;
        int right =0;
        int max =0;

        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==')'){
                right++;
            }
            else{
                left++;
            }

            if(left==right){
                max=Math.max(left*2 , max);
            }
            else if(right>left){
                left = right =0;
            }
        }

        left = right =0;

        for(int i =s.length()-1;i>=0 ;i--){
            if(s.charAt(i)==')'){
                right++;
            }
            else{
                left++;
            }
            if(left==right){
                max=Math.max(left*2 , max);
            }
            else if(left>right){
                left = right =0;
            }

        }
        return max;
    }
}