class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start =1;
        int end=piles[0];
        for(int pile:piles){
            end = Math.max(end , pile);
        }
        while(start<=end){
            int mid = start +(end - start)/2;
            if(isValid(piles , mid ,h)){
                end =mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public boolean isValid(int [] piles , int mid , int h){
        long hr=0;
        for(int pile:piles){
            hr+=(pile+mid-1)/mid;
        }
        return hr<=h;
    }
}