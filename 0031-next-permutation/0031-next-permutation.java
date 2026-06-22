class Solution {
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int index=-1;
        for(int i=l-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                index=i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, l - 1);
            return;
        }
        for (int i = l - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index + 1, l - 1);
    }
    public int[] reverse(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
    public int[] swap(int [] nums,int i1 , int i2){
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
        return nums;
    }
}