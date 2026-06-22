class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            int ind=0;
            for(int num2:nums2){
                nums1[ind]=num2;
                ind++;
            }
        }
        for(int i = 0;i<nums2.length;i++){
            for(int j= (m-1+i);j>=0 ; j--){
                nums1[j+1]=nums2[i];
                if(nums2[i]<nums1[j]){
                    int temp=nums1[j];
                    nums1[j]=nums2[i];
                    nums1[j+1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}