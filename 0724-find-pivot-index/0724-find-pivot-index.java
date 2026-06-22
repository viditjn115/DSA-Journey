class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
        }
        int pref_sum=0;
        for(int i=0;i<nums.length ; i++){
            if(pref_sum==(sum-(pref_sum+nums[i]))){
                return i;
            }
            pref_sum+=nums[i];
        }
        return -1;
    }
}