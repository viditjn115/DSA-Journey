    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int l=0;
            int r=0;
            int c=0;
            int p=1;
            while(r<nums.length && l<=r ){
                p*=nums[r];
                while(p>=k && l<=r){
                    p/=nums[l]; 
                    l++;
                }
                c+=(r-l+1);
                r++;
            }
            return c;
        }
    }