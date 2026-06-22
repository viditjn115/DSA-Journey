class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start =bloomDay[0];
        int end =0;
        for(int bd:bloomDay){
            start = Math.min(start,bd);
            end = Math.max(end , bd);
        }
        int ans =-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(isValid(bloomDay , mid , m ,k)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;
    }
    public boolean isValid(int [] bloomDay , int mid , int m , int k){
        int c=0;
        int total_bq=0;
        for(int bd:bloomDay){
            if(bd<=mid){
                c++;
                if(c==k){
                total_bq++;
                c=0;
            }
            }
            else{
                c=0;
            }
        }
        return total_bq>=m;
    }
}