class Solution {
    public int trailingZeroes(int n) {
        int maxCount=0;
        int count=1;
        int num=5;
        while(count!=0){
            count=n/num;
            maxCount+=count;
            num*=5;
        }
        return maxCount;
    }
}