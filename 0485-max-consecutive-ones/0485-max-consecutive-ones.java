class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int i=0;
        while(ones==0 && i<nums.length){
            if(nums[i]==1){
                ones++;
            }
            i++;
        }
        int maxOnes=ones;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==1){
                ones++;
            }
            else{
                ones=0;
            }
            maxOnes=Math.max(maxOnes,ones);
        }
        return maxOnes;
    }
}