class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        int max_len=0;
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            sum+=nums[i];
            if(map.containsKey(sum)){
                max_len=Math.max(max_len , i-map.get(sum));
            }
            else{
                map.put(sum , i);
            }
        }
        return max_len;
    }
}