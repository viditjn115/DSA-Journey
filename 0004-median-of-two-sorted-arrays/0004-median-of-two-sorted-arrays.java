class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length){
            return findMedianSortedArrays(nums2 , nums1);
        }
        int leftSize = (nums1.length+nums2.length+1)/2;
        int start =0; 
        int end = nums1.length;
        while(start<=end){ 
            int partition1= start +(end-start)/2;
            int partition2= leftSize - partition1;
            int l1=(partition1==0)? Integer.MIN_VALUE:nums1[partition1-1];
            int r1=(partition1==nums1.length)? Integer.MAX_VALUE : nums1[partition1];
            int l2=(partition2==0)? Integer.MIN_VALUE : nums2[partition2-1];
            int r2=(partition2==nums2.length)? Integer.MAX_VALUE : nums2[partition2];
            if(l2>r1){
                start=partition1+1;
            }
            else if(l1>r2){
                end=partition1-1;
            }
            else{
                if((nums1.length+nums2.length)%2==0){
                    double median = (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                    return median;
                }
                else{
                    return Math.max(l1,l2);
                }
            }
        }
        return 0; 
    }
}