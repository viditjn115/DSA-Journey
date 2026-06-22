class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int l=nums.length;
        int e=l-1;
        int ind_1=-1;
        int ind_2=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                if(nums[s]!=target){
                    s++;
                }
                if(nums[e]!=target){
                     e--;
                }
                if(nums[s]==target && nums[e]==target){
                    ind_1=s;
                    ind_2=e;
                    break;
                }
            }
        }
    int[] res={ind_1,ind_2};
    return res;
    }
}