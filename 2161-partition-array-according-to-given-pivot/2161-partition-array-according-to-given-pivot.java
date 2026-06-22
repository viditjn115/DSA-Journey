class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l=nums.length;
        int [] res=new int[l];
        int k=0;
        for(int num:nums){
            if(num<pivot){
                res[k]=num;
                k++;
            }
        }
        for(int num:nums){
            if(num==pivot){
                res[k]=num;
                k++;
            }
        }
        for(int num:nums){
            if(num>pivot){
                res[k]=num;
                k++;
            }
        }
        return res;
    }
}