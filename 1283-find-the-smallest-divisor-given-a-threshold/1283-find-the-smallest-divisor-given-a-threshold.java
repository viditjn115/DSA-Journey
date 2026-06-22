class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=nums[0];
        for(int num:nums){
            end=Math.max(end , num);
        }
        int ans=0; 
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(nums ,mid , threshold)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int [] nums , int mid , int threshold){
        int sum=0;
        for(int num:nums){
            sum+=(num+mid-1)/mid;
        }
        return sum<=threshold;
    }
}