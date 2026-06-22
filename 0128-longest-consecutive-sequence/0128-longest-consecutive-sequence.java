class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set= new HashSet<>();
     for(int i=0;i<nums.length;i++){
         set.add(nums[i]);
     }
     int max_length=0;
     for(int i:set){
        if(!set.contains(i-1)){
            int k=i+1;
            int length=1;   
            while (set.contains(k)){
                length++;
                k++;
            }
            max_length=Math.max(max_length,length);    
        }
     }
     return max_length;
    }
}