class Solution {
    public int majorityElement(int[] nums) {
        int element=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(c==0){
                element =nums[i];
                c=1;
            }
            else{
                if(nums[i]==element){
                    c++;
                }
                else{
                    c--;
                }
            }
        }
        return element;
    }
}