class Solution {
    boolean chq = false;
    public boolean checkEqualPartitions(int[] nums, long target) {
        long p =1;
        for(int num:nums){
            p*=num;
        }
        if(p==target*target){
            backtrack(nums, target ,0 , 1);
        }
        return chq;
    }
    public void backtrack (int [] nums , long target , int ind , long p){
        if(p>target || ind==nums.length){
            return;
        }
        else if(p==target){
            chq=true;
            return;
        }
        for(int i = ind ;i<nums.length;i++){
            p*=nums[i];
            backtrack(nums,target , i+1 , p );
            p/=nums[i];
        }
    } 
}