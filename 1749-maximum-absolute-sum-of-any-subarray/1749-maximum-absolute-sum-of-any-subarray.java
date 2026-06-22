class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
            max_sum=Math.max(sum,max_sum);
            if(sum<0){
                sum=0;
            }
        }
        sum=0;
        for(int num:nums){
            sum+=num;
            min_sum=Math.min(sum , min_sum);
            if(sum>0){
                sum=0;
            }
        }
        max_sum=Math.max(max_sum ,Math.abs(min_sum));
        return max_sum;
    }
}