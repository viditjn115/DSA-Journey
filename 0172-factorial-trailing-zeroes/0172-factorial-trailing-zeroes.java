class Solution {
    public int trailingZeroes(int n) {
        int maxCount=0;
        while(n>0){
            n/=5;
            maxCount+=n;
        }
        return maxCount;
    }
}