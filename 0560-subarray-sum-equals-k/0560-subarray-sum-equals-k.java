import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=nums.length;
        Map<Long,Integer> Map=new HashMap<>();
        long pref_sum=0;
        int c=0;
        for(int i=0;i<l;i++){
            pref_sum+=nums[i];
            if(pref_sum==k){
                c++;
            }
            long rem=pref_sum-k;
            if(Map.containsKey(rem)){
                c+=Map.get(rem);
            }
            Map.put(pref_sum,Map.getOrDefault(pref_sum, 0) + 1);
        }
        return c;
    }
}