class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int [] newnums= new int[nums.length/2];
        for(int i=0;i<nums.length-1;i=i+2){
            if(i%4==0){
                newnums[i/2]=Math.min(nums[i],nums[i+1]);
            }
            else{
                newnums[i/2]=Math.max(nums[i],nums[i+1]);
            }
        }
        return minMaxGame(newnums);
    }
}