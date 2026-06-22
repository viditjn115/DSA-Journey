class Solution {
    public int [] rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        for(int i=0;i<l/2;i++){
            int temp =nums[i];
            nums[i]=nums[l-i-1];
            nums[l-i-1]=temp;
        }
        for(int i=0;i<k/2;i++){
            int temp =nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=temp;
        }
        for(int i=k;i<k+(l-k)/2;i++){
            int temp =nums[i];
            nums[i]=nums[l+k-i-1];
            nums[l+k-i-1]=temp;
        }
        return nums;
    }
}