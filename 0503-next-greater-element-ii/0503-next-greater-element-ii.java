class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res=new int [nums.length];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=2*nums.length-1;i>=0;i--){
            int ind=i%nums.length;
            while(!dq.isEmpty() && nums[ind]>=nums[dq.peek()]){
                dq.pop();
            }
            if(i<nums.length){
                if(dq.isEmpty()) {
                res[ind] = -1;
                } else {
                res[ind] = nums[dq.peek()];
                }
            }
            dq.push(ind);
        }
    return res;
    }
}