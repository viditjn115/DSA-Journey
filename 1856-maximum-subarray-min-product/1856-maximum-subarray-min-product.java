class Solution {
    final long modulo = 1_000_000_007;
    public int maxSumMinProduct(int[] nums) {
        Deque<Integer> dq = new ArrayDeque<>();
        long[] prefix = new long[nums.length+1];
        for(int i =0 ;i<nums.length ;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        long maxMinProduct=0;
        for(int i=0 ;i<=nums.length ;i++){
            while(!dq.isEmpty() && (i==nums.length || nums[i]<nums[dq.peek()])){
                int ind = dq.pop();
                int right = i-1;
                int left = dq.isEmpty()? 0:dq.peek()+1;
                long sum =prefix[right +1]- prefix[left];
                maxMinProduct=Math.max(maxMinProduct , sum*nums[ind]);
            }
            dq.push(i);
        }
        return (int)(maxMinProduct%modulo);
    }
}