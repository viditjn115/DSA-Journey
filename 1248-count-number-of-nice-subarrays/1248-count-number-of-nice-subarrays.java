class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return (noOfSubarray(k,nums)-noOfSubarray(k-1 ,nums));
    }
    public int noOfSubarray(int k , int [] nums){
        int left =0;
        int right=0;
        int c=0;
        int odLen=0;
        while(right<nums.length){
            if(nums[right]%2!=0){
                odLen++;
            }
            while(odLen>k){
                if(nums[left]%2!=0){
                    odLen--;
                }
                left++;
            }
            if(odLen<=k){
                c+=(right-left+1);
            }
            right++;
        }
        return c;
    }
}