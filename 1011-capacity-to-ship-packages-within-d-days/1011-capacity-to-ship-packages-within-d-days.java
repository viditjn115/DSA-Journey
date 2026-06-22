class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int wt:weights){
            sum+=wt;
        }
        int start =0;
        int end = sum;
        int ans=-1;
        while(start<=end){
            int mid=start +(end -start)/2;
            if(isValid(weights , mid , days)){
                ans=mid;
                end=mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int [] weights , int max_allw_wt, int days  ){
        int day=1;
        int wt=0;
        for(int i =0;i<weights.length;i++){
            if(weights[i]>max_allw_wt){
                return false;
            }
            if(weights[i]+wt<=max_allw_wt){
                wt+=weights[i];
            }
            else{
                day++;
                wt=weights[i];
            }
        }
        if(day<=days){
            return true;
        }
        else{
            return false;
        }
    }
}