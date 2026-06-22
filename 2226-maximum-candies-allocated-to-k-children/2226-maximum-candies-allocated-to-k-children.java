class Solution {
    public int maximumCandies(int[] candies, long k) {
        int start=1;
        int end=candies[0];
        for(int candy:candies){
            end=Math.max(end , candy);
        }
        int ans=0;
        while(start<=end){
            int mid=start +(end - start)/2;
            if(isValid(candies , mid , k)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int [] candies , int mid , long k){
        long max_child=0L;
        for(int candy :candies){
            max_child+=(candy/mid);
        }
        return max_child>=k;
    }
}