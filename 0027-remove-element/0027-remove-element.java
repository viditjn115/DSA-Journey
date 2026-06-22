class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        int c=0;
        for(int i :nums){
            if(i==val){
                c++;
            }
        }
        int ind=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=val){
                nums[ind]=nums[i];
                ind++;
            }
        }
        return l-c;
    }
}