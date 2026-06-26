class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long score=0;
        int pos=0;
        for(int i=1 ;i<nums.size();i++){
            if(nums.get(i)>nums.get(pos)){
                score+=(long)nums.get(pos)*(i-pos);
                pos=i;
            }
        }
        score+=(long)nums.get(pos)*(nums.size()-1-pos);
        return score;
    }
}