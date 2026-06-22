class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c=0;
        int sum=0;
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            int rem=((sum%k)+k)%k;
            c+=map.getOrDefault(rem,0);
            map.put(rem , map.getOrDefault(rem , 0)+1);
        }
        return c;
    }
}