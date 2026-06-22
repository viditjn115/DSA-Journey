class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        int low=0;
        int mid=0;
        int high=l-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,high,mid);
                high--;       
            }
            else if(nums[mid]==1){
                mid++;
                
            }   
            else{
                swap(nums,mid,low);
                low++;
                mid++;
            }
        }
        return;
    }
    public int [] swap(int [] nums , int i_1 , int i_2){
        int temp=nums[i_1];
        nums[i_1]= nums[i_2];
        nums[i_2]= temp;
        return nums;
    }
}