class Solution {
    public int [] moveZeroes(int [] nums) {
        int l=nums.length;
        int s_1=0;
        int s_2=0;
        while(s_1<l){
            if(nums[s_1]!=0){
                nums[s_2]=nums[s_1];
                s_2++;
                s_1++;
            }
            else{
            s_1++;
            }   
        } 
        for (int i=s_2;i<l;i++){
            nums[i]=0;
        }
        return nums; 
    }
}