class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=nums.length;
        int s=0;
        int e=l-1;
        int ind=0;
        if(l>1){
        while(s<e && (e-s)!=2){
            int mid=s+(e-s)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid-1]){
                    e=mid;
                }
                else if(nums[mid]==nums[mid+1]){
                    s=mid;
                }
                else{
                    return nums[mid];
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    s=mid+1;    
                }
                else if(nums[mid]==nums[mid+1]){
                    e=mid-1;
                }
                else{
                    return nums[mid];
                }
            }
        }
        if(nums[s]==nums[(s+(e-s)/2)]){
            return nums[e];
        }
        else {
            return nums[s];}
        
        }
        return nums[s];
    }
}