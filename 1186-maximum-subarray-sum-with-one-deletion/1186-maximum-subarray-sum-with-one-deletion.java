class Solution {
    public int maximumSum(int[] arr) {
       int sum=arr[0];
       int sum_del=0;
       int max_sum=arr[0];
       for(int i=1;i<arr.length;i++){
        sum_del=Math.max(sum, sum_del+arr[i]);
        sum=Math.max(arr[i] , arr[i]+sum);
        max_sum=Math.max(max_sum ,  Math.max(sum,sum_del));
       } 
       return max_sum; 
    }
}