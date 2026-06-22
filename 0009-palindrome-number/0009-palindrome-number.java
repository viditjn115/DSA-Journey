class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
        int rev=0;
        int og=x;
        while (x!=0){
            int dig =x%10;
            rev=rev*10+ dig;
            x=x/10;
        }
        if(rev==og){
            return true;
        }
        else{
            return false;
        }
    }
}}