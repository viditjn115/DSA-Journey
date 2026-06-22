class Solution {
    public int jump(int[] nums) {
    int l=nums.length;
    int s=0;
    int e=0;
    int jump=0;
    while(e<(l-1)){
        int farthest=0;
        for(int i=s;i<=e;i++){
            farthest=Math.max(farthest, nums[i]+i);
        }
        s=e+1;
        e=farthest;
        jump+=1;
    }
    return jump;
    }
}