class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num:nums){
            end+=num;
        }
        int ans=-1;
        while(start<=end){
            int mid=start + (end -start)/2;
            if(isValid(nums , mid , k)){
                ans = mid;
                end =mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
     public boolean isValid(int [] nums , int max_allw_sum, int k  ){
        int kk=1;
        int sum=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max_allw_sum){
                return false;
            }
            if(nums[i]+sum<=max_allw_sum){
                sum+=nums[i];
            }
            else{
                kk++;
                sum=nums[i];
            }
        }
        if(kk<=k){
            return true;
        }
        else{
            return false;
        }
    }
}