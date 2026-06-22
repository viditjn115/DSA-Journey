    class Solution {
        public int findMin(int[] nums) {
            int s=0;
            int e=nums.length-1;
            int m=Integer.MAX_VALUE;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[s]<=nums[mid]){
                    m=Math.min(nums[s],m);
                    s=mid+1;
                }
                else{
                    m=Math.min(nums[mid],m);
                    e=mid-1;
                }
            }
            return m;
        }
    }